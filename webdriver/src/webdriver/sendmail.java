package webdriver;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xml.sax.SAXException;

public class sendmail {
	static WebDriver driver=new FirefoxDriver();
	static String baseurl="http://mail.qainfotech.net";
	String parenthandle=null;
	
	public void navigate()
{
	driver.navigate().to(baseurl);
}
public void logindetails()
{
	driver.findElement(By.xpath(".//*[@id='loginTable']/tbody/tr/td/table/tbody/tr[3]/td[2]/input")).sendKeys("harshagarwal@qainfotech.net");
    driver.findElement(By.xpath(".//*[@id='loginTable']/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("H@r$h");
 
 login();
	
}
public void login()
{
	driver.findElement(By.tagName("input").name("Logon")).click();	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public void opencomposeview()
{
	driver.findElement(By.tagName("div").id("ComposeTable")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	for(String window : driver.getWindowHandles()) {
		driver.switchTo().window(window);
		if(driver.getCurrentUrl().equals("https://mail.qainfotech.net/Worldclient.dll?Session=XPED40H3940YT&View=Compose&New=Yes"))
			break;
	}
}
public void emaildetails() throws SAXException, IOException, Exception
{
	driver.findElement(By.id("To")).sendKeys("harsh101892@gmail.com");
	 driver.findElement(By.id("Subject")).sendKeys("test mail");
	 	parenthandle();
		/*WebElement frame1= driver.findElement(By.xpath(".//*[@id='cke_1_contents']/iframe"));
		driver.switchTo().frame(frame1);
		WebElement div=driver.findElement(By.xpath("//div"));*/
		/*DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
	 	db.parse("https://mail.qainfotech.net/Worldclient.dll?Session=XPED40H3940YT&View=Compose&New=Yes");
	 	*/
//		org.jsoup.nodes.Document doc=Jsoup.connect("https://mail.qainfotech.net/Worldclient.dll?Session=XPED40H3940YT&View=Compose&New=Yes").get();
//		doc.g
		/*doc.getDocumentElement().normalize();
		XPath xPath = XPathFactory.newInstance().newXPath();
		Node node = (Node)xPath.evaluate(".//*[@id='cke_1_contents']/iframe//div",
		        doc.getDocumentElement(), XPathConstants.NODESET);*/
		
		
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	 	js.executeScript("document.getElementsByClassName('cke_wysiwyg_frame cke_reset')[0].contentDocument.getElementsByTagName('div')[0].innerHTML='<p> this is a test mail </p>'", "");
	 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 	sendmail();
}
public void sendmail()
{
	driver.switchTo().window(parenthandle);
	WebElement send= driver.findElement(By.id("SendNow"));
	send.click();	
}
 public void parenthandle()
 { parenthandle=driver.getWindowHandle();}


	public static void main(String[] args) throws SAXException, IOException, Exception
{
	sendmail mailobj=new sendmail();
	mailobj.navigate();
	mailobj.logindetails();
	mailobj.opencomposeview();
	mailobj.emaildetails();
	driver.quit();
}
}
	

//WebElement frame = driver.findElement(By.tagName("iframe"));
	//driver.switchTo().frame(frame); */
	//WebDriver driver1=new FirefoxDriver();
	//driver1.get(driver.getCurrentUrl());
	
	//System.out.println(ul);
	//List<WebElement> to = driver.findElements(By.tagName("textarea"));
//	WebElement mail=
	//driver.switchTo().window(driver.getWindowHandle());		
	
	/*for(WebElement to1: to)
	{
		if(to1.getText().equals("To")) 
			{to1.sendKeys("prateekshachauhan@qainfotech.net");
		break;}
	}*/
	
	/*for(WebElement subject1: subject)
	{
		if(subject1.getText().equals("To")) 
			{subject1.sendKeys("automated mail");
		break;}
	}*/
	
	
	//driver.findElement(By.tagName("html")).sendKeys("this is a test mail");
	//frame.sendKeys("this is a test mail");
	



