import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com/");
  Thread.sleep(5000);
  driver.findElement(By.name("q")).sendKeys("mobile");
  List<WebElement>elements=  driver.findElements(By.xpath("//li[@role='presentation']"));
  System.out.println("suggestion");
  for(WebElement e : elements)   {
  System.out.println(e.getText());
  }
  driver.quit();
	}

}
