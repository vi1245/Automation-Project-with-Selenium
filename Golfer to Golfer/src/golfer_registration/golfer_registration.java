package golfer_registration;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class golfer_registration {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "D://All Drivers//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        //Set the Username
			String username = "golfer";
			
			//Set the password
			String password = " ";
			
			String URL = "https://" +username +":" +password +"@"+ "dev.golfertogolfer.com";
			driver.get(URL);
			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			String title = driver.getTitle();
			
			System.out.println("The page title is "+title);
			
			String text = driver.findElement(By.tagName("p")).getText();
			
			System.out.println("The test present in page is ==> "+text);
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://dev.golfertogolfer.com/");
	      System.out.println(driver.manage().window().getSize()); //output: (994, 718)
	      driver.manage().window().maximize();
	      System.out.println(driver.manage().window().getSize()); //output: (1382, 744)
	      driver.findElement(By.xpath("#topbar > div > div.selectbox.mr-auto > div > a:nth-child(1)")).click();
	      Thread.sleep(5000);
	      //Registration Form
	      
	      driver.findElement(By.cssSelector("#topbar > div > div.logout > a:nth-child(2)")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("tester");
	      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Team"); 
	      driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("qateamphp1@gmail.com");
	      driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("1234567890");
	      driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Virtual Team");
	      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1212121212");
	      driver.findElement(By.xpath("//input[@placeholder='Repeat Password']")).sendKeys("1212121212");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	      driver.findElement(By.xpath("//button[@id='registerFormBtn']")).click();
	      Thread.sleep(2000);
	      
	      System.out.println("We have sent an email to you");

	} 

}
