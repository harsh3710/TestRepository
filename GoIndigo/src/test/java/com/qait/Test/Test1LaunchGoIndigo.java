package com.qait.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qai.Dsl.BaseUrl;

public class Test1LaunchGoIndigo extends BaseUrl {

	BaseUrl test = new BaseUrl();
	
	@BeforeClass
	public void LaunchBrowser(){
		
		test.launchBrowser();
		}
	
	@Test //(dependsOnMethods={"LaunchBrowser"})
	public void OpenWebsite()
	{
		test.openWebsite();
		
	}
	@Test (dependsOnMethods={"OpenWebsite"})
	public void EnterSourceCity()
	{
		test.enterSourceCity();
	}
	@Test (dependsOnMethods={"EnterSourceCity"})
	public void EnterDestinationCity()
	{
		test.enterDestinationCity();
	}
	@Test (dependsOnMethods={"EnterDestinationCity"})
	public void EnterOriginDate()
	{
		test.enterOriginDate();
	}
	@Test (dependsOnMethods={"EnterOriginDate"})
	public void EnterReturnDate()
	{
		test.enterReturnDate();
	}
	@Test (dependsOnMethods={"EnterReturnDate"})
	public void SearchFlights()
	{
		test.searchFlight();
	}
	@Test (dependsOnMethods={"SearchFlights"})
	public void SelectFlightAndContinue()
	{
		test.selectFlightAndContinue();
	}
	@Test (dependsOnMethods={"SelectFlightAndContinue"})
	public void ContactDetails()
	{
		test.contactDetails();
	}
	@Test (dependsOnMethods={"ContactDetails"})
	public void PassengerDetails() throws InterruptedException
	{
		test.passengerDetails();
	}
	@Test (dependsOnMethods={"PassengerDetails"})
	public void ProceedToSelectSeats()
	{
		test.proceedToSelectSeats();
	}
	@Test (dependsOnMethods={"ProceedToSelectSeats"})
	public void ReviewBooking() throws InterruptedException
	{
		test.reviewBooking();
	}

}
