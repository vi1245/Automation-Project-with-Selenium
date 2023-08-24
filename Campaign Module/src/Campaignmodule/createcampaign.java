package Campaignmodule;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createcampaign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.web.mpzmail.com/");
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
		
		
		// Campaign creation started 
		
		Thread.sleep(5000);
		driver.get("https://dev.web.mpzmail.com/cp/campaigns");
		driver.findElement(By.xpath("//button[@class='button button-md']")).click();
		driver.findElement(By.cssSelector("#root > div > div.uiDrawer.slideIn.full > div.uiDrawerInner > div > div.row.center-xs > div:nth-child(1) > div > div.cta > button")).click();
		driver.findElement(By.xpath("//input[@name='campaignName']")).sendKeys("Automation Script");
		driver.findElement(By.xpath("//button[@class='button button-md primary no-shadow']")).click();
		driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > section > div > div:nth-child(1) > div.campaign-holder > div > div.row.mar-b30 > div.col-md-offset-2.col-lg-offset-2.animate.col-xs-12.col-sm-12.col-md-8.col-lg-8 > div > div.form-group.mar-b0 > div > div")).click();
		driver.findElement(By.xpath("//input[@name='sub1']")).click();
		Thread.sleep(5000);
		String errortxt = driver.findElement(By.xpath("//div[@class='paper-class negative']")).getText();
		System.out.println(errortxt);
		
	}

}
