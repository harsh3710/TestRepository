package browser;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class countlink {
public static void main(String []args) throws IOException
{
	Document doc=Jsoup.connect("http://www.qainfotech.com").get();
	Document d = Jsoup.parse(new URL("http://www.google.com"), 1000);
	
	Elements link=doc.select("link");
	int count= link.size();
	System.out.println("The no. of links present are:"+count);
	for(Element link1: link )
	{
		System.out.println(link1.text() + "\t"+link1.attr("href"));
	}
}
}
