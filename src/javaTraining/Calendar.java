package javaTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions a=new Actions(driver);
			
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.findElement(By.xpath("//input[@id='form-field-travel_to']")).sendKeys(Keys.TAB);
		WebElement datefield=driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
	    JavascriptExecutor execute=(JavascriptExecutor)driver;
	    execute.executeScript("arguments[0].click();",datefield );
	    Thread.sleep(5000);
	    driver.close();
	    
		
		
		

	}

}
