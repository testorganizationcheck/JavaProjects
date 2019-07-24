package weekone;

import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCSignupxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf#");
		
		LinkedHashSet abc = (LinkedHashSet) driver.getWindowHandles();
		System.out.println(abc);
		
	}
}
