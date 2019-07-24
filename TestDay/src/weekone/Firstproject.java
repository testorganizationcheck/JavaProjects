package weekone;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.irctc.co.in/nget/train-search");
		Driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[7]/span").click();
		Driver.findElementByLinkText("Sign up").click();
		Thread.sleep(2000);
		Driver.findElementByXPath("//*[@id='bluemenu']/ul/li[2]/a").click();
		Driver.findElementByLinkText("Stays").click();
		Driver.findElementByLinkText("Lounge").click();
		Set<String> winid = Driver.getWindowHandles();
		for(String win:winid)
		{
			Driver.switchTo().window(win);
			
		}
		Thread.sleep(1000);
		Driver.quit();
		
		
		
		
	}

}
