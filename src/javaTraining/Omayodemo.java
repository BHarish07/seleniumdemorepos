package javaTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Omayodemo {

	private static final Class<? extends Throwable> NosuchElementException = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("THe code is updated in newbranch");

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");

		String text = driver.findElement(By.id("pah")).getText();

		System.out.println(text);

		WebElement dropdwn = driver.findElement(By.id("drop1"));
		WebElement muldrpdwn = driver.findElement(By.id("multiselect1"));

		Select sel = new Select(dropdwn);

		sel.selectByVisibleText("doc 2");
		Select selm = new Select(muldrpdwn);
		selm.selectByIndex(0);

		selm.selectByValue("Hyundaix");

		selm.selectByVisibleText("Audi");

		WebElement textbox = driver.findElement(By.id("ta1"));
		textbox.clear();

		textbox.sendKeys("Hi welcome to Selenium training");

		driver.findElement(By.id("radio1")).click();

		driver.findElement(By.id("confirm")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.className("dropbtn")).click();

		/*
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 * 
		 * WebElement
		 * fbele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
		 * "Facebook")));
		 * 
		 * fbele.click();
		 */
		// driver.findElement(By.linkText("Facebook")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		WebElement fbele = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.linkText("Facebook"));
			}

		});
		fbele.click();

		driver.navigate().back();
		driver.findElement(By.linkText("Blogger")).click();

		driver.findElement(By.linkText("Open a popup window")).click();

		Set<String> windowid = driver.getWindowHandles();

		Iterator<String> itr = windowid.iterator();
		String para = null;

		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Basic Web Page Title")) {
				para = driver.findElement(By.id("para1")).getText();
			}

		}
		System.out.println(para);
		driver.quit();

	}

}
