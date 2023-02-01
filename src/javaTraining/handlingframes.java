package javaTraining;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class handlingframes {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		 * driver.get("http://omayo.blogspot.com/"); WebElement iframe =
		 * driver.findElement(By.id("navbar-iframe")); driver.switchTo().frame(iframe);
		 * driver.findElement(By.cssSelector("input#b-query")).sendKeys("Hello");
		 * driver.switchTo().defaultContent();
		 * driver.findElement(By.id("ta1")).sendKeys("Hello, Welcome");
		 */

		/*
		 * //Light Box
		 * 
		 * driver.get("http://omayo.blogspot.com/p/lightbox.html");
		 * driver.findElement(By.id("lightbox1")).click();
		 * driver.findElement(By.cssSelector(".close.cursor")).click();//css
		 * selector=[class='close cursor']
		 * 
		 */

		// Actions class

		/*
		 * driver.get("http://omayo.blogspot.com/");
		 * 
		 * WebElement blogmenu = driver.findElement(By.id("blogsmenu")); WebElement
		 * sel143 = driver.findElement(By.xpath("//span[text()='Selenium143']"));
		 * 
		 */
		Actions a = new Actions(driver);

		/*
		 * a.moveToElement(blogmenu).perform();
		 * a.moveToElement(sel143).click().perform();
		 * 
		 */
		/*
		 * driver.get("http://omayo.blogspot.com/p/page3.html"); WebElement minprice =
		 * driver.findElement(By.cssSelector("[aria-labelledby='price-min-label']")); //
		 * WebElement maxprice = //
		 * driver.findElement(By.cssSelector("[aria-labelledby='price-max-label']"));
		 * a.dragAndDropBy(minprice, -100, 0).perform(); Thread.sleep(2000); //
		 * WebElement iframe = driver.findElement(By.id("iframe2"));
		 * 
		 * //driver.switchTo().frame(iframe); // WebElement frametext =
		 * driver.findElement(By.xpath("//p[text()='Please try again in 30 seconds.']"))
		 * ; // a.contextClick(frametext).perform();
		 * 
		 * WebElement text = driver.findElement(By.id("ta1")); text.sendKeys("Hello");
		 * a.doubleClick(text).perform();
		 * 
		 */
		// DragAndDrop
		/*
		 * driver.get(
		 * "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 * WebElement Oslo = driver.findElement(By.id("box1")); WebElement Stockholm =
		 * driver.findElement(By.id("box2")); WebElement Washington =
		 * driver.findElement(By.id("box3")); WebElement Copenhagen =
		 * driver.findElement(By.id("box4")); WebElement Seoul =
		 * driver.findElement(By.id("box5")); WebElement Rome =
		 * driver.findElement(By.id("box6")); WebElement Madrid =
		 * driver.findElement(By.id("box7"));
		 * 
		 * WebElement Norway=driver.findElement(By.id("box101")); WebElement
		 * Sweden=driver.findElement(By.id("box102")); WebElement
		 * UnitedStates=driver.findElement(By.id("box103")); WebElement
		 * Denmark=driver.findElement(By.id("box104")); WebElement
		 * SouthKorea=driver.findElement(By.id("box105")); WebElement
		 * Italy=driver.findElement(By.id("box106")); WebElement Spain
		 * =driver.findElement(By.id("box107"));
		 * 
		 * a.dragAndDrop(Oslo, Norway).perform(); a.dragAndDrop(Rome, Italy).perform();
		 * a.dragAndDrop(Washington, UnitedStates).perform(); a.dragAndDrop(Stockholm,
		 * Sweden).perform(); a.dragAndDrop(Madrid, Spain).perform();
		 * a.dragAndDrop(Copenhagen, Denmark).perform(); a.dragAndDrop(Seoul,
		 * SouthKorea).perform();
		 * 
		 */

		driver.get("http://omayo.blogspot.com/");
		// WebElement compendiumdev = driver.findElement(By.linkText("compendiumdev"));
		// a.moveToElement(compendiumdev).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

		WebElement username = driver.findElement(By.name("userid"));
		WebElement paswrd = driver.findElement(By.name("pswrd"));

		username.sendKeys("User");
		a.sendKeys(Keys.TAB).perform();
		paswrd.sendKeys("password");
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		// driver.close();

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("abcxyzpqr@gmail.com");
		//Taking Screenshot
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Screenshots\\screenshot1.png"));
		
	//We can use pre defined sel class intead of Fileutils--	FileHandler.copy(file, new File("Screenshots\\screenshot1.png"));
		
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Logout")).click();
		

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	    email = driver.findElement(By.id("input-email"));
		email.sendKeys("abc@gmail");
		Thread.sleep(3000);
		email.sendKeys(Keys.chord(Keys.CONTROL, "z"));
		//Taking Screenshot
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Screenshots\\screenshot2.png"));
		
		
	driver.quit();
	

	}

}
