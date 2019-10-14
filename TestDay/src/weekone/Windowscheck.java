package weekone;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Windowscheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com/");   
     driver.findElementByXPath("//*[@name='q']").sendKeys("google");
     driver.findElementByXPath("//*[@name='q']").sendKeys(Keys.ENTER);     
     Actions move = new Actions(driver);
    // move.moveToElement(driver.findElementByXPath("//h3[text()='Google']")).perform();
    // move.contextClick().sendKeys(Keys.ARROW_DOWN).perform();  
    move.contextClick(driver.findElementByXPath("//h3[text()='Google']")).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    driver.navigate();
   
 }     
    
	}

