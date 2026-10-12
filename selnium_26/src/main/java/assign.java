import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/");
   Thread.sleep(4000);
   List<WebElement> links = driver.findElements(By.tagName("a"));
   System.out.println("Count:"+links.size());
   for(int i=0;i<links.size();i++) {
	   System.out.println(i+"" +links.get(i).getText());
   }
   driver.quit();
}   
}