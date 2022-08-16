package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {
	/*
	 * Locator 
	 */

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // open your web url
		
		
		
		//name
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//css selectors
		WebElement searchBox1 = driver.findElement(By.cssSelector("input[name= 'q']"));
		
		//Xpath
		WebElement searchBox2 = driver.findElement(By.xpath("//input[@name = 'q']"));
		WebElement searchButton = driver.findElement(By.name("btnK"));// By.name send properly or copy past.
		
		
	//	WebElement hindiLink = driver.findElement(By.linkText("हिन्दी")); // for in hindi language similar as for other language 
	//	hindiLink.click();
		
		//Link Text
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		aboutLink.click();
		
		searchBox.sendKeys("Time of India");
		driver.navigate().back(); // previous page
		Thread.sleep(2000);
		searchButton.click();
		
	

	}

}
