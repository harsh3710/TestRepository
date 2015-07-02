package com.qai.Dsl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUrl {

	
	WebDriver driver;
	
	 public void launchBrowser(){
		 
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		  }
	 
	 public void openWebsite()
	 {
		 driver.get("https://book.goindigo.in");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	
	 public void enterSourceCity()
	 {
		 driver.findElement(By.xpath(".//*[@id='txtOriginStationRound']")).click();
		 driver.findElement(By.xpath(".//*[@id='OriginRound_DEL']/span")).click();
	 }
	 public void enterDestinationCity()
	 {
		 driver.findElement(By.xpath(".//*[@id='txtDestinationStationRound']")).sendKeys("indore");
		 driver.findElement(By.xpath(".//*[@id='sDestRound_IDR']")).click();
	 }
	public void enterOriginDate()
	{
		driver.findElement(By.xpath(".//*[@id='indiGoRoundTripSearch_DepartureDate']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
	}
	public void enterReturnDate()
	{
		driver.findElement(By.xpath(".//*[@id='indiGoRoundTripSearch_ReturnDate']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
	}
	public void searchFlight()
	{
		driver.findElement(By.xpath(".//*[@id='indiGoRoundTripSearch_Submit']")).click();
	}
	public void selectFlightAndContinue()
	{
		driver.findElement(By.xpath(".//*[@id='indiGoAvailability_fareRules_DoesAgreeToTerms']")).click();
		driver.findElement(By.xpath(".//*[@id='indiGoAvailability_Submit']")).click();
	}
	public void contactDetails()
	{
	driver.findElement(By.xpath(".//*[@id='indiGoContact_Name_Title']")).click();
	driver.findElement(By.xpath(".//*[@id='indiGoContact_Name_Title']/option[2]")).click();
	driver.findElement(By.xpath(".//*[@id='indiGoContact_Name_First']")).sendKeys("sgvsd");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_Name_Last']")).sendKeys("sdvsrghser");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_AddressLine1']")).sendKeys("dvsdv sudvhiu sdjvd");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_City']")).sendKeys("lsdhlsd");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_CountryProvinceState']"));
	driver.findElement(By.xpath(".//*[@id='indiGoContact_CountryProvinceState']/option[36]"));
	driver.findElement(By.xpath(".//*[@id='indiGoContact_PostalCode']")).sendKeys("352525");;
	driver.findElement(By.xpath(".//*[@id='indiGoContact_HomePhone']")).sendKeys("65463185456");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_OtherPhone']")).sendKeys("1234567898"); 
	driver.findElement(By.xpath(".//*[@id='indiGoContact_WorkPhone']")).sendKeys("1245987525");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_EmailAddress']")).sendKeys("zhcayfew@gmail.com");
	driver.findElement(By.xpath(".//*[@id='indiGoContact_ReceivePromotional']")).click();
	driver.findElement(By.xpath(".//*[@id='contactCookie_RetainDetails']")).click();
	
	}
	public void passengerDetails() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__Name_Title']")).click();
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__Name_Title']/option[2]")).click();
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__Name_First']")).sendKeys("sdvdsv");
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__Name_Last']")).sendKeys("xwgxfb");
	//	driver.findElement(By.xpath(".//*[@id='imThisTraveler']")).click();
	//	driver.findElement(By.xpath(".//*[@id='imThisTraveler']")).click();
		Thread.sleep(1*1000);
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobDay']")).click();
		
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobDay']/option[13]")).click();
		Thread.sleep(1*1000);
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobMonth']")).click();

		WebElement month= driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobMonth']/option[11]"));//.click();
		month.click();
		//System.out.println(month.getText().toString());
		Thread.sleep(1000*1);
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobYear']")).click();
		driver.findElement(By.xpath(".//*[@id='indiGoPassengers_0__TypeInfo_dobYear']/option[27]")).click();
		Thread.sleep(1*1000);
	}
	public void proceedToSelectSeats()
	{
		
		driver.findElement(By.xpath(".//*[@id='submitToSeatMap']")).click();
		driver.findElement(By.xpath(".//*[@id='saveSelectedSeats']")).click();
	}
	public void reviewBooking() throws InterruptedException
	{
		Thread.sleep(4*1000);
		//for (String window:driver.getWindowHandles())
		//{
		//	//if
		//	driver.switchTo().window("window");
			driver.findElement(By.xpath(".//*[@id='service']/div/div[2]/div/div/div[3]/div[2]/div[3]/div[3]/a")).click();
		//}
	}
	
}
