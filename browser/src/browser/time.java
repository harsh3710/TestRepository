package browser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class time {
	@Test 
	public  void main() throws  IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter hour(0<=hour<=12):");
		int hour=Integer.parseInt(br.readLine());
		System.out.println("Enter minutes(0<=min<=60):");
		int min=Integer.parseInt(br.readLine());
		double hrang= hour*30 + min*0.5;
		double minang= min*6;
		double diff=Math.abs(hrang-minang);
		System.out.print("the difference between hour and clock hand is:"+ minang);
		System.out.println();
	}

}
