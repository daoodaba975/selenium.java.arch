import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRINCIPAL {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//driver = PARAM.Rules();
		
		// REGLAGES-PAR-DEFAUTS
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\driver\\chromedriver.exe");
		driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
        
        
        // HAUT-DE-PAGE
        hautPage HautDePage = new hautPage();
        HautDePage.testPage();
        
        driver.close();
        
        
        
        
        
        //HautDePage instanceHautDePage2 = new HautDePage();
        //instanceHautDePage2.navigate2_HP(driver);
        //instanceHautDePage.navigate3_HP(driver);
        
        /* MILIEU-DE-PAGE
        MilieuDePage instanceMilieuDePage = new MilieuDePage();
        instanceMilieuDePage.test1(driver);
        
        // PIED-DE-PAGE
        PiedDePage instancePiedDePage = new PiedDePage();
        instancePiedDePage.test2(driver); */
        
        //driver.close();
	}
}