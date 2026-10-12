import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver =new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
 Thread.sleep(3000);
 
 Actions actions =new Actions(driver);
 WebElement click =driver.findElement(By.id("clickable"));
 actions.contextClick(click).perform();
 WebElement text =driver.findElement(By.id("click-status"));
 System.out.println(text.getText());
 
 driver.get("https://the-internet.herokuapp.com/context_menu");
 WebElement click1 =driver.findElement(By.id("hot-spot"));
 actions.contextClick(click1).perform();
 String text1 =driver.switchTo().alert().getText();
 System.out.println(text1);
 driver.switchTo().alert().accept();
 
 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
 WebElement click2 =driver.findElement(By.className("")
 actions.contextClick(click2).perform();
 String text2 =driver.switchTo().alert().getText();
 System.out.println(text2);
 
 
 
 
 
 

 
 
	}

}
