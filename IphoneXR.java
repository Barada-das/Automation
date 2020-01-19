package Working_with_ZestMoney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class IphoneXR {
	
	static   String s1= "";
	static   String s2= "";
	WebDriver driver;
	
	@Test
	public void Open() throws Exception {
	
 //	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./Driver//chromedriver.exe");
	    WebDriver	 driver = new ChromeDriver();
	    //Search in FlipkartS
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//Search Iphone XR
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone XR (64GB) - Yellow");
        driver.findElement(By.className("_2BhAHa")).click();
        Thread.sleep(5000);
        s1 = driver.findElement(
        		By.xpath("//*[@class=\"_1vC4OE _2rQ-NK\"]")).getText().replaceAll("[^0-9]", "");               
	}
        //Search in Amazon Webside
        @Test
        public void NewWindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Driver//chromedriver.exe");
	    WebDriver	 driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone XR (64GB) - Yellow");
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        Thread.sleep(5000);
        s2 = driver.findElement(
        		By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")).getText().replaceAll("[^0-9]", "");
	       }  
        
        @AfterTest
        public void PrintResult()  {
        	System.out.println(Integer.parseInt(s1) < Integer.parseInt(s2) ? Integer.parseInt(s1) :Integer.parseInt(s2));
        	System.out.println("Amzon website has lesser value for the iPhone XR ");
          }
        
     }