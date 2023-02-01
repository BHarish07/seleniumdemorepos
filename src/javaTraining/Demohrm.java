package javaTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demohrm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnits.SECONDS);
		
		
		/*
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * driver.findElement(By.name("username")).sendKeys("Admin");
		 * 
		 * driver.findElement(By.name("password")).sendKeys("admin123");
		 * driver.findElement(By.cssSelector("button[type='submit']")).click();
		 */
		/*
		 * driver.get("http://omayo.blogspot.com/"); List<WebElement> elements =
		 * driver.findElements(By.tagName("a"));
		 */
		/*
		 * for each loop for(WebElement i:elements) { if(i.getText().length()>0) {
		 * System.out.println(i.getText()); } }
		 */
		/*
		 * for(int i=0;i<elements.size();i++) { if(elements.get(i).getText().length()>0)
		 * { System.out.println(elements.get(i).getText()); } }
		 * 
		 * 
		 * driver.quit();
		 */
		driver.get("http://omayo.blogspot.com/");
		
	/*	driver.findElement(By.linkText("Open a popup window")).click();

		Set<String> windowids = driver.getWindowHandles();

		Iterator<String> itr = windowids.iterator();

		String mainwindow = itr.next();
		String childwindow = itr.next();
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.findElement(By.id("para2")).getText());
		driver.close();
		driver.switchTo().window(mainwindow);
	System.out.println(driver.findElement(By.id("pah")).getText());
	*/
		//Implicit wait-global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.findElement(By.className("dropbtn")).click();
//Explicit wait-webdriver wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
		//driver.findElement(By.linkText("Facebook")).click();
	driver.close();
		

	}

}
