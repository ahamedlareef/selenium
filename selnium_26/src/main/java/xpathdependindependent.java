import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdependindependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText(" Gift Card")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),50 physical')]/../..//input[@value='Add to cart']")).click();
	Thread.sleep(3000);
	driver.quit();
	
	

	}

}
