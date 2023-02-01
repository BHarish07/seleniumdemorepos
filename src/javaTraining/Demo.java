package javaTraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		// int a = 77, b = 55;

		// Swapping two numbers
		/*
		 * with using 3rd variable int c; c=a; a=b; b=c;
		 * 
		 */
		/*
		 * without using 3rd variable a=a-b; b=a+b; a=b-a;
		 */
		/*
		 * with out using 3rd variable a=a*b; b=a/b; a=a/b;
		 */

		/*
		 * with single statement a=a+b-(b=a);
		 * 
		 */
		// System.out.println("Value of a is :" + a);
		// System.out.println(" Value of b is : " + b);
		/*
		 * int a=8; switch (a) {
		 * 
		 * case 0: System.out.println("The day is Sunday"); break; case 1:
		 * System.out.println(" The day is Monday"); break; case 2:
		 * System.out.println("The is Tuesday"); break; case 3:
		 * System.out.println("The day is Wednesday"); break; case 4:
		 * System.out.println("The is day is Thursday"); break; case 5:
		 * System.out.println("The day is Friday"); break; case 6:
		 * System.out.println("The day is Saturday"); break; default:
		 * System.out.println("Invalid Week number"); }
		 */
		/*
		 * int a=15, b=9; boolean c=(a>b)? true:false;
		 * 
		 * System.out.println(c);
		 */

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();

		Set<String> windowsid = driver.getWindowHandles();

		Iterator<String> itr = windowsid.iterator();

		String para = null;
		while (itr.hasNext()) {

			String window = itr.next();

			driver.switchTo().window(window);
			if(driver.getTitle().equals("Basic Web Page Title")) {
				
				para=driver.findElement(By.id("para2")).getText();
				
			}
					

		}
		System.out.println(para);
		driver.quit();

	}

}
