package javaTraining;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickerdropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		
		File image1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(image1, new File("Screenshots\\image1.png"));
		
		WebElement datefield=driver.findElement(By.xpath("//input[@id='dob']"));
		//To Scroll to the element
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", datefield);
		
		datefield.click();
		
	WebElement mnthdrpdwn=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	
	Select month=new Select(mnthdrpdwn);
	month.selectByVisibleText("May");	
	WebElement yrdrpdwn=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
	
	Select year=new Select(yrdrpdwn);
	year.selectByVisibleText("1996");
	
	String date="20";
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	for(WebElement dts:dates) {
			String dt=dts.getText();
			if(dt.equals(date)) {
				dts.click();
				break;
			}
				
		
	}
	
	File image2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(image2,new File("Screenshots\\image2.png"));
	
	
	driver.quit();
	
	
	
	
	
		

	}

}
