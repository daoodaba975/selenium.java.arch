import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hautPage {
	
	COMMUN thisAffiche = new COMMUN();
	//COMMUN thisClick = new COMMUN();
	//COMMUN thisBack = new COMMUN();
	
	By xpathLinkStore = By.xpath("//a[@href='/store-finder']");
	WebDriver driver;
	
	public void SetDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testPage() throws InterruptedException {
		
		WebElement Link = driver.findElement(xpathLinkStore);
		
		thisAffiche.VerifAfficahage(Link);

		//thisClick.Click(Link);
		//thisBack.Back();
		
	}
	
	/*
	public void navigate2_HP(WebDriver driver) {
		
		WebElement ContactUs = driver.findElement(By.xpath("//a[@href='http://www.cx.sap.com/contact']"));
		
		thisClick.VerifBeforeClick(ContactUs);
		//thisBack.Back();
        
        //driver.close();
	}
	public void navigate3_HP(WebDriver driver) {
		
		WebElement Help = driver.findElement(By.xpath("//a[@href='/faq']"));
		
		thisClick.VerifAfficahage(Help);
		thisBack.Back();
        
        //driver.close();
	}
	
	public void search_HDP() {
		
		//driver.findElement(By.xpath("//a[@href='/store-finder']")).click();
        //driver.navigate().back();
        //driver.findElement(By.xpath("//a[@href='http://www.cx.sap.com/contact']")).click();
        //driver.navigate().back();
        //driver.findElement(By.xpath("//a[@href='/faq']")).click();
        
        //driver.close();
	}
	
	public void left_HDP() {
		
		//driver.findElement(By.xpath("//a[@href='/store-finder']")).click();
        //driver.navigate().back();
        //driver.findElement(By.xpath("//a[@href='http://www.cx.sap.com/contact']")).click();
        //driver.navigate().back();
        //driver.findElement(By.xpath("//a[@href='/faq']")).click();
        
        //driver.close();
	}
	*/
}