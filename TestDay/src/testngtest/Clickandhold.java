package testngtest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
	     
	      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	      WebElement ele= driver.findElementByXPath("//*[@id='ControlOptionsTopHolder_lbSelectionMode_I']");
	      Thread.sleep(3000);
	      driver.executeScript("arguments[0].click();", ele);
	      driver.findElementByXPath("//*[@id='ControlOptionsTopHolder_lbSelectionMode_I']").sendKeys("Multi",Keys.ENTER);
	            /*Select sel = new Select(ele);
	            sel.selectByValue(arg0);*/
	            Thread.sleep(9000);
	            Actions opt = new Actions(driver);
	            opt.clickAndHold(driver.findElementById("ContentHolder_lbFeatures_LBI1T0")).build().perform();
	            opt.clickAndHold(driver.findElementById("ContentHolder_lbFeatures_LBI0T0")).build().perform();          

	            
	   
	           
	            

	}

}
