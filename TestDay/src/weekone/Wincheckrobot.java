package weekone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wincheckrobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     RemoteWebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	    
	     driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf#");	    
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/a").click();
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/ul/li[2]/a").click();
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/a").click();
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/ul/li[2]/a").click();
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/a").click();
	     driver.findElementByXPath("//*[@id='bluemenu']/ul/li[6]/ul/li[2]/a").click();
	     String out1 = driver.getTitle();
	     System.out.println(out1);
	     Thread.sleep(5000);
	     Robot robo = new Robot();
	     robo.keyPress(KeyEvent.VK_CONTROL);
	     robo.keyPress(KeyEvent.VK_SHIFT);
	     robo.keyPress(KeyEvent.VK_TAB);
	     robo.keyRelease(KeyEvent.VK_TAB);
	     robo.keyRelease(KeyEvent.VK_SHIFT);
	     robo.keyRelease(KeyEvent.VK_CONTROL);
	     robo.keyPress(InputEvent.BUTTON1_DOWN_MASK);
	     robo.keyRelease(InputEvent.BUTTON1_DOWN_MASK);
	     String out2 = driver.getTitle();	    
	     System.out.println(out2);	     
	}

}
