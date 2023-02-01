package javaTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);

		driver.get("https://www.makemytrip.com/");
		WebElement fromcity = driver.findElement(By.id("fromCity"));
		fromcity.sendKeys("de");
		Thread.sleep(2000);
	/*	int i = 0;
		while (i < 4) {
			Thread.sleep(2000);
			a.sendKeys(Keys.ARROW_DOWN).build().perform();

			i++;
		}

		a.sendKeys(Keys.ENTER).build().perform();
		*/
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		WebElement tocitytextfield=driver.findElement(By.id("toCity"));
		tocitytextfield.sendKeys("Hy");
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

		Thread.sleep(2000);

	}

}
