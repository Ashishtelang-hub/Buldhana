package WebElements;
// RadioBox
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement maleRadioBox = driver.findElement(By.id("gender-radio-1"));
		WebElement femaleRadioBox1 = driver.findElement(By.id("gender-radio-2"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		
		WebElement sportsCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
		
		
		
		Thread.sleep(2000);

	}

}
