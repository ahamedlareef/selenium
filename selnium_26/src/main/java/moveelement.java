import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
  Thread.sleep(3000);
  
  Actions actions =new Actions(driver);
  WebElement element =driver.findElement(By.id("mouse-tracker"));
  actions.moveToElement(8 , 12).perform();
  
  
	}

}
