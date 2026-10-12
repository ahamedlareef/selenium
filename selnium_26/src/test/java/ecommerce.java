import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Node.Sort;

public class ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.saucedemo.com/");
  Thread.sleep(3000);
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  Thread.sleep(2000);
  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  Thread.sleep(2000);
  driver.findElement(By.id("login-button")).click();
  
  WebElement  sortDropdown =driver.findElement(By.className("product_sort_container"));
  Select select =new Select(sortDropdown);
  List<WebElement> Options =((Select) Options).getOptions();
  {
  for(WebElement e: Options) {
	  System.out.println(e.getText());
  }
  
 Sort.SelectByvisibleText("Price (low to high)");
 Thread.sleep(2000);
 dropdown =driver.findElement(By.className("product_sort_container"));
 Select newsort =new Select(dropdown);
  String selectedOption =select.getFirstSelectedOption().getText();
  System.out.println();
  
  WebElement Selected =newsort.getFirstSelectedOption();
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  driver.quit();
	}

}
