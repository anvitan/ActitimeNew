import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {

		//	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//    WebDriver  driver= new FirefoxDriver();
		WebDriverManager.chromedriver().setup();  
		//        WebDriver driver=new ChromeDriver();
		//        driver.get("http://Google.com");
		//        driver.close();
		System.out.println(WebDriverManager.chromedriver().getBinaryPath());
	}

}
