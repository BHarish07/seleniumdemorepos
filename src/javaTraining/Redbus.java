package javaTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal")).click();
		
		String year="2023";
		String month="Mar";
		String date="5";
		
		while(true) {
			String text=driver.findElement(By.className("monthTitle")).getText();
			String mnthandyear[]=text.split(" ");
			String mn=mnthandyear[0];
			String yr=mnthandyear[1];
			if(mn.equals(month) &&yr.equals(year)) 
				break;
			else
				driver.findElement(By.xpath("//button[text()='>']")).click();
		
		}
		
		List<WebElement> webele=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		for(WebElement ele:webele) {
		String dt=	ele.getText();
			if(dt.equals(date)){
				ele.click();
				break;
			}
		}
		
		
		
	
		
		
		

	}

}
