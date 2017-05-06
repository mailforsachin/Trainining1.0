package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LaunchChrome {
	public void initChrome()
    {
		/*Setting the ChromeDriver exe file present in Project*/
		System.setProperty("webdriver.chrome.driver", "../SeleniumProject/UtilityFile/chromedriver.exe");
		
		/*Variables declaration*/
		WebDriver driver;   	
		    	
		/*Disabling the extensions appearing in Chrome Browser*/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		    	
		/*Call to ChromeDriver*/
		driver = new ChromeDriver(options);
    	
		/*Launch 'Toolsqa' site*/
		driver.get("http://toolsqa.com/selenium-tutorial/");
		
		System.out.println("Chrome Browser Launched");
		
		/*Click on home page*/
		driver.findElement(By.xpath(".//*[@id='primary-menu']/li[1]/a/span[1]/span/span")).click();

		System.out.println("Clicked on Home Page");
    }
}
