import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

class COMMUN {
	
	static WebDriver driver;
	
	public void VerifAfficahage (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			System.out.println("L'element " +monElement + " s'affiche bien.");
		}
		else {
			System.out.println("L'element " +monElement + " ne s'est pas bien affiché, vérifié votre xPath..");
		}
	}
	
	public void VerifBeforeClick (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			monElement.click();
			System.out.println("L'élement " +monElement + " s'est bien affiché et le click est passé.");
		}
		else {
			System.out.println("L'élement " +monElement + " ne s'est pas bien affiché, vérifié votre xPath.");
		}
	}
	
	public void Click (WebElement monElement) {
		monElement.click();
	}
	
	public void Back () {
		driver.navigate().to("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
	}

}
