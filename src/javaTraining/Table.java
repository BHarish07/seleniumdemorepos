package javaTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
	/*	
		List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		
		String givenname="Dheepthi";
		
		int row=0;
		
		for(int i=0;i<headings.size();i++) {
			
		
			if(headings.get(i).getText().equals(givenname)) {
				row=i;
			    
			}
			
		}
	String path="//table[@id='table1']//tr["+(row+1)+"]//td[3]";// xpath://table[@id='table1']//tr[4]/td[3]
	System.out.println(driver.findElement(By.xpath(path)).getText());
	
	*/
		
		/*for(WebElement headtext:headings) {
					
			String name=headtext.getText();
			if(name.equals(givenname))
			{
				
				
			}
			
		}*/
		
		
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//td"));
		String givenname="Kishore";
		
		int row=0;
		for(int i=0;i<tabledata.size();i++) {
			String data=tabledata.get(i).getText();
			if(data.equals(givenname)) {
				row=i;
			}
		}
		String path="//table[@id='table1']//tr["+(row+1)+"]/td[3]";
		System.out.println(driver.findElement(By.xpath(path)).getText());
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td")).size());
		
				
		driver.quit();
		
	}

}
