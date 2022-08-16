package WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	//	WebElement username = driver.findElement(By.name("Create New Account"));
		//Create New Account
		WebElement alertButton = driver.findElement(By.tagName("Create New Account"));
		alertButton.click();
	  //  username.click();
		
	//	driver.findElement(By.name("pass")).sendKeys("Ashish@1995");
	//	driver.findElement(By.name("login")).click();
		
		
		

	}

}
