package Working_with_TripAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Trip_Advisor {
WebDriver driver;
	
	@Test
	public void Open() throws Exception {
	
 //	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","./Driver//chromedriver.exe");
	    WebDriver	 driver = new ChromeDriver();
	    //Search in FlipkartS
		driver.navigate().to("https://www.tripadvisor.in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//<div class="brand-global-nav-action-search-Search__searchButton--b9-IK brand-global-nav-action-search-Search__grayOutline--3DjHN" title="Search"><span class="ui_icon search brand-global-nav-action-search-Search__icon--2DVjd"></span><span class="brand-global-nav-action-search-Search__label--3PRUD">Search</span> </div>
		////*[@id="component_14"]/div/div/div/div[2]/div/div/div[5]/div
		////*[@id="component_10"]/div/div/div/div[2]/div/div/div[5]/div
		driver.findElement(By.xpath
				("//*[@class=\"brand-global-nav-action-search-Search__searchButton--b9-IK brand-global-nav-action-search-Search__grayOutline--3DjHN\"]"))
		.click();
		
		
		//driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.xpath("//*[@id=\"mainSearch\"]")).sendKeys("Club Mahindra");
		driver.findElement(By.xpath("//*[@id=\"SEARCH_BUTTON\"]")).click();
		Thread.sleep(5000);
		driver.findElement
		(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span")).
		click();
		Thread.sleep(5000);
	
      driver.findElement(By.linkText("Write a review")).click();
      
   }
}
