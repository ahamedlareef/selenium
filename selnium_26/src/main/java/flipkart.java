import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title=Search for products, brands and more']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@tittle=Search for products, brands and more']")).
		

	}

}
