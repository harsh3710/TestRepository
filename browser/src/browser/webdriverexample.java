package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverexample {

	static WebDriver driver = new FirefoxDriver();
	private static String baseUrl="http://www.qainfotech.com/";
	
	public static void main(String []args)
	{	
		driver.get(baseUrl);
	System.out.println("Select all links from webpage using selenium webdriver");
	List links=driver.findElements(By.tagName("a"));
	//List links = driver.findElement(By.xpath("//*")).findElements(By.tagName("a"));

	System.out.println("total no. links available on webpage");
	System.out.println(links.size());

	System.out.println("Text of the link available on the webpage");
	for(int i =0; i< links.size();i++){
	System.out.println(((WebElement) links.get(i)).getText());

		
	}
	}
	//  @Test
	
	  }
