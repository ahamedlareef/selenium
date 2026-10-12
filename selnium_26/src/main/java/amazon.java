import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Thread.sleep(5000);
    driver.findElement(By.id("twotabsearchbook")).sendKeys("books");
    Thread.sleep(3000);
    driver.findElement(By.id("nav-search-submit-button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(""))
    
    
	}

}
