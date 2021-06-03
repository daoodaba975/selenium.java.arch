import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PARAM {
	
	public void Rules(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\driver\\chromedriver.exe");
		
		driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
        
	}
}