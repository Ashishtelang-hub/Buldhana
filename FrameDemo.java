package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1"); // this will switch your parent driver focus to internal frame
		
		WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame heading: " +frameHeading.getText());
		
		driver.close();

	}

}
