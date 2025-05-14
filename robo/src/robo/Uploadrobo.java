package robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Uploadrobo {
	
	WebDriver driver;
	@BeforeTest
	public void sampleimageRobot()
	{
		//System.setProperty("webdriver.gecko.driver","C:\Users\shino\Downloads\geckodriver-v0.29.0-win64\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shino\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://online2pdf.com");
		
		
	}
	
	@Test
	public void choosefilerobo() throws InterruptedException, AWTException
	
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td/div[5]/table/tbody/tr[1]/td[1]/div/div[7]/form/div[1]/div[1]/div/div/div[1]/table/tbody/tr/td/div[1]/button"));

				element1.click();
		StringSelection  sel = new StringSelection("C:\\Users\\shino\\Downloads\\PP2\\dummy.pdf"); 
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				Robot robot = new Robot();Thread.sleep(1000);
				robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
				robot.keyPress(java.awt.event.KeyEvent.VK_V);
			
				robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
				
		
		
		

	}

}
