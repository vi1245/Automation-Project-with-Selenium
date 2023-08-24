package Campaignmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enableauthenticationtrigger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","D:drivers/geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("https://dev.web.mpzmail.com/");
//       WebDriverWait wait = new WebDriverWait(driver, 20);
//       wait.until(ExpectedConditions.elementToBeClickable(lastElementToLoad));
		 WebElement username=driver.findElement(By.xpath("//*[@name='emailAddress']"));
		 WebElement userpassword=driver.findElement(By.xpath("//*[@name='password']"));
		 WebElement login=driver.findElement(By.xpath("//*[@class='button no-shadow min-width button-md']"));
		 username.sendKeys("dikshachaudhary1@virtualemployee.com");
		 userpassword.sendKeys("Dikshach@12345");
		 login.click();
		 System.out.print("Login Susccessfully!");
		
		 //Starting verification on 2FA Module
		 
		 WebElement secure=driver.findElement(By.xpath("//*[@class='button button-xs outline red']"));
		 secure.click();
		
		// Go to step for TWO FACTOR AUTHENTICATION
		 String newline = System.lineSeparator();

		System.out.println("TWO FACTOR AUTHENTICATION" + newline + "Secure your account with two factor authentication, using any authenticator app on your mobile phone");
		
		WebElement clicktoggle = driver.findElement(By.xpath("//*[@name='twoFAEnabled']"));
		clicktoggle.click();
		System.out.println("Enabled Susccessfully");
	}
}
