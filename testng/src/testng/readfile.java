package testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Factory;


public class readfile {
	
	@Factory
	public Object[] main() throws IOException
	{
		ArrayList<String> content=new ArrayList<String>();
		//int arr[]=new int[5];
		File file = new File("test.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			content.add(line);
			
		}
		fileReader.close();
		System.out.println("Contents of file:");
		Object[] obj1=new Object[5];
		//for(int i=0;i<content.size();i++)
		//{    
			obj1[0]= new displayfile(content.get(0));
			obj1[1]= new displayfile(content.get(1));
			obj1[2]= new displayfile(content.get(2));
			obj1[3]= new displayfile(content.get(3));
			obj1[4]= new displayfile(content.get(4));
		//}
		 //return new Object[]{new displayfile(content.get(0)),new displayfile(content.get(1)),new displayfile(content.get(2)),new displayfile(content.get(3)),new displayfile(content.get(4))};
		return obj1;
			
	}
}
