package formmoduele;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class createform {
	
	private static WebElement buttonElement;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/All Drivers/latest/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dev.web.mpzmail.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("dikshachaudhary1@virtualemployee.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dikshach@12345");
		driver.findElement(By.xpath("//button[@class='button no-shadow min-width button-md']")).click();
		driver.getTitle();
		
		// Company Changed
		
		WebElement switchbtn=driver.findElement(By.xpath("//button[@class='button button-xs outline primary mar-l10 hide-sm hide-xs']"));
		switchbtn.click();
		WebElement clickcmpny=driver.findElement(By.cssSelector("#root > div > div.uiDrawer.slideIn > div.uiDrawerInner > span > div > div:nth-child(2) > div > ul > li:nth-child(7) > p"));
		clickcmpny.click();
		System.out.println("Company Changed (Virtual Employee Pvt. Ltd.)");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Form Creation Started 
		
		Thread.sleep(5000);
		//Locate URL'S
		
		driver.get("https://dev.web.mpzmail.com/cp/forms");
		//Click on create form button
		
		driver.findElement(By.xpath("//button[@class='button button-md']")).click();
		//Click on existing group
		
		driver.findElement(By.xpath("//button[@class='button button mid-shadow button-sml full-width button-md']")).click();
		//Click on existing group
		
		driver.findElement(By.cssSelector("#root > div > div.uiDrawer.slideIn > div.uiDrawerInner > div > div > div > div > div > div.row > div:nth-child(2) > div")).click();
		//Click on form theme
		
		driver.findElement(By.cssSelector("#root > div > div.uiDrawer.slideIn > div.uiDrawerInner > div > div > div > div:nth-child(3) > div > div > div > div > div:nth-child(2) > div > div.extraSpace.theme")).click();
		
		driver.findElement(By.cssSelector("#mpmInnerForm > div > div:nth-child(3) > div.mpm-col-xs-12 > input[type=text]")).click();
		driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > div > div.eContainer > div.blocksPanel.animatedPanel.expanded > div > div:nth-child(2) > div > div.blocksContent > div > div > div:nth-child(1) > div > div > div:nth-child(1) > select > option:nth-child(3)")).click();
    
		driver.findElement(By.xpath("//button[@class='button button-md']")).click();	
		driver.findElement(By.cssSelector("#dragDropToolBar > div.actions > ul > li:nth-child(3) > a")).click();
		Thread.sleep(5000);
		
		// Form Send Process Started
		
		driver.findElement(By.xpath("//button[@class='button button-md min-width primary']")).click();
		int i;
		for(i=0;i<=2;i++) {
		buttonElement.click();
		
		Thread.sleep(5000);
		
		}
		
	}

}

