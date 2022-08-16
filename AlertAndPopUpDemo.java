package WebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopUpDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().window().maximize();    id="timerAlertButton" confirmButton
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
	//	WebElement alertButton = driver.findElement(By.id("alertButton"));
	//	alertButton.click();
	    WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
		alertButton.click();
	//	WebElement alertButton = driver.findElement(By.id("confirmButton"));
		
		
	//	WebElement promptButton = driver.findElement(By.id("promtButton"));
	//	promptButton.click();
	Thread.sleep(5000);
//	Alert promptAlert = driver.switchTo().alert();
//	promptAlert.sendKeys("HI Ashish");
//	promptAlert.accept();
	

	}

}
