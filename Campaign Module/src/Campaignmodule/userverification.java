package Campaignmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class userverification {

	//private static By lastElementToLoad;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		 System.setProperty("webdriver.gecko.driver","D:drivers/geckodriver.exe");
//         WebDriver driver = new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver", "C:/Users/vikashsharma/emcast/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://dev.web.mpzmail.com/");
//         WebDriverWait wait = new WebDriverWait(driver, 20);
//         wait.until(ExpectedConditions.elementToBeClickable(lastElementToLoad));
 		 WebElement username=driver.findElement(By.xpath("//*[@name='emailAddress']"));
 		 WebElement userpassword=driver.findElement(By.xpath("//*[@name='password']"));
 		 WebElement login=driver.findElement(By.xpath("//*[@class='button no-shadow min-width button-md']"));
 		 username.sendKeys("qateamautomation@yopmail.com");
 		 userpassword.sendKeys("Qa@12345");
 		 login.click();
// 		 System.out.print("Login Susccessfully!");
//         WebDriverWait wait = new WebDriverWait(driver, 20);
//         wait.until(ExpectedConditions.elementToBeClickable(lastElementToLoad));
//         driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
         driver.get("https://dev.web.mpzmail.com/cp/home/");
         System.out.print("Welcome to MPZMail(Start Verification)");
         Thread.sleep(5000);
		 WebElement Questionnaire = driver.findElement(By.xpath("//*[@class='button button-sml outline white']"));
		 Questionnaire.click();
	 Thread.sleep(5000);
		 WebElement question1 = driver.findElement(By.xpath("//*[@name='question1']"));
		 question1.sendKeys("Social Media"); 
	 Thread.sleep(5000);
		 WebElement question2 = driver.findElement(By.xpath("//*[@name='question2']"));
		 question2.sendKeys("N/A");
		 Thread.sleep(5000);
		 WebElement question3 = driver.findElement(By.xpath("//*[@name='question3']"));
		 question3.sendKeys("N/A");
		 Thread.sleep(5000);
		 WebElement question4 = driver.findElement(By.xpath("//*[@name='question4']"));
		 question4.sendKeys("https://google.com/");
	 Thread.sleep(5000);
		 WebElement continuebtn = driver.findElement(By.xpath("//*[@class='button no-shadow']"));
		 continuebtn.click();
		 
		 WebElement housename = driver.findElement(By.xpath("//*[@name='address1']"));
		 housename.sendKeys("Virtual Employee");
	 Thread.sleep(5000);
		 WebElement street = driver.findElement(By.xpath("//*[@name='address2']"));
		 street.sendKeys("Virtual Employee");
	 Thread.sleep(5000);
		 WebElement address = driver.findElement(By.xpath("//*[@name='address3']"));
		 address.sendKeys("Virtual Employee");
		 Thread.sleep(5000);
		 WebElement town_city = driver.findElement(By.xpath("//*[@name='city']"));
		 town_city.sendKeys("Greater Noida");
	 Thread.sleep(5000);
		 WebElement county = driver.findElement(By.xpath("//*[@name='county']"));
		 county.sendKeys("Noida");
		 Thread.sleep(5000);
		 WebElement postcode = driver.findElement(By.xpath("//*[@name='postCode']"));
		 postcode.sendKeys("201009");
		 Thread.sleep(5000);
		 Select dropdown = new Select(driver.findElement(By.xpath("//*[@name='country']")));  
		 dropdown.selectByVisibleText("India"); 
		 Thread.sleep(5000);
		 WebElement contbtn = driver.findElement(By.xpath("//*[@class='button no-shadow']"));
		 contbtn.click();
		 
		 
		 System.out.println("Page title: " + driver.getTitle());

	       String actualUrl="https://web.mpzmail.com/cp/home/";
	       String expectedUrl= driver.getCurrentUrl();
	      
	      if(actualUrl.equalsIgnoreCase(expectedUrl))
	      {
	          System.out.println("Test passed");
	      }
	      else 
	      {
	          System.out.println("Campaign Create Succcessfully!");
	      }
	      //driver.quit(); 
		
	}
	
}
