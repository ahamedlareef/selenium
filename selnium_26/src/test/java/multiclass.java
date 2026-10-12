import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import org.openqa.selenium.By;

public class multiclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver =new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://qaplayground.com/");
 Thread.sleep(3000);
 WebElement element =driver.findElement(By.id("sel-skills"));
 Select category=new Select(element);
 boolean ans =category.isMultiple();
 System.out.println(ans);
 category.selectByValue("robot");
 Thread.sleep(2000);
 
 
 
 
	}

}
