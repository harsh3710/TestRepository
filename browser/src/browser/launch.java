package browser;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

// ...
public class launch 
{
	public static void main(String []args){

if(Desktop.isDesktopSupported())
{
  try {
	Desktop.getDesktop().browse(new URI("http://www.google.com"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (URISyntaxException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}


	}

}
