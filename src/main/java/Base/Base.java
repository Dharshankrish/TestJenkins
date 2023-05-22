package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Actions act;

	public static void Initialize() {
		System.setProperty("webdriver.chrome.driver", "/Users/mk/Downloads/chromedriver_mac_arm64/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
	}
}
