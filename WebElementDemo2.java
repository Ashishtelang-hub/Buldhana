package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo2 {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variable
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Lainch website
		driver.navigate().to("http://www.google.com/");
		
		// click on the search text box and send value
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		// click on the all the search botton
		driver.findElement(By.name("btnK")).click();
		
		
	

	}

}
