import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frtchdetailsofrow {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/challenging_dom");
	Thread.sleep(4000);
	String get=driver.findElement(By.xpath("td.text"))
			
	
		

	}

}