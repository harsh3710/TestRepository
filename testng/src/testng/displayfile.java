package testng;

import org.testng.annotations.Test;

public class displayfile {
	
	public String data;
	public displayfile(String cntnt)
	{
		this.data=cntnt;
	}
	@Test
	public void display()
	{
		System.out.println(data);
	}

}
