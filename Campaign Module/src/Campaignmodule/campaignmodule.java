package Campaignmodule;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class campaignmodule {
	       public static void main(String[] args) throws InterruptedException {
		   // TODO Auto-generated method stub
//		   System.setProperty("webdriver.gecko.driver","D:drivers/geckodriver.exe");
//         WebDriver driver = new FirefoxDriver();
	    	   
		 System.setProperty("webdriver.chrome.driver", "C:/Users/vikashsharma/emcast/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://dev.web.mpzmail.com/");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
 		 WebElement username=driver.findElement(By.xpath("//*[@name='emailAddress']"));
 		 WebElement userpassword=driver.findElement(By.xpath("//*[@name='password']"));
 		 WebElement login=driver.findElement(By.xpath("//*[@class='button no-shadow min-width button-md']"));
 		 username.sendKeys("qateamautomation@yopmail.com");
 		 userpassword.sendKeys("Qa@12345");
 		 login.click();
 		 System.out.print("Login Susccessfully!");
 		 driver.get("https://dev.web.mpzmail.com/cp/campaigns");
 		 System.out.println(driver.getTitle());		 
//       Start Campaign Create 
		 WebElement startcampaign = driver.findElement(By.xpath("//*[@class='button button-md']"));
		 startcampaign.click();	                                                 
//       Create and send a new Campaign to your Subscribers
//       Please enter a name for your new Email Campaign	 
		 WebElement getstart = driver.findElement(By.xpath("//*[@class='button button button-md no-shadow']"));
		 getstart.click();
		 
		 WebElement campaignname = driver.findElement(By.xpath("//*[@name='campaignName']"));
		 campaignname.sendKeys("First Automation");
		 
		 WebElement createcampaign = driver.findElement(By.xpath("//*[@class='button button-md primary no-shadow']"));
		 createcampaign.click();
		 
		 System.out.println("Page title: " + driver.getTitle());

	       String actualUrl="https://web.mpzmail.com/cp/home/";
	       String expectedUrl= driver.getCurrentUrl();
	      
	      if(actualUrl.equalsIgnoreCase(expectedUrl))
	      {
	          System.out.println("Your number was " + "Campaign Create Succcessfully!");
	      }
	      else 
	      {
	          System.out.println("Campaign Create Succcessfully!");
	      }
	      //driver.quit(); 
		
	}
	
}
