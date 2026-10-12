import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class singleselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
   
 driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
 Thread.sleep(3000);
 WebElement element =driver.findElement(By.id("inputGroupSelect03"));
 Select title=new Select(element);
 title.selectByVisibleText(" Dr.");
 Thread.sleep(2000);
 title.selectByValue("3");
 Thread.sleep(2000);
 title.selectByValue("2");
 Thread.sleep(2000);
 driver.quit();
 
	}

}
