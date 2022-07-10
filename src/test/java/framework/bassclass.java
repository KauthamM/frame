package framework;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bassclass {

	WebDriver driver;
	
	private void getdriver() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		}
	
	private void loadurl(String url) {
		
		driver.get(url);
		
		}
	
	private void maximize() {
		
		driver.manage().window().maximize();
	}
	
	private void type(WebElement element,String data) {
		
		element.sendKeys(data);
	}
	 
	private void click(WebElement element) {
		
		element.click();	
	}
	
	
	
	
	
}
