import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.
import org.openqa.selenium.remote.RemoteWebDriver;

public class verifybutton {

	public static <WebDriver> void main(String[] args) {
		// TODO Auto-generated method stub
   ChromeDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");
   Thread.sleep(3000); 
	}

}
