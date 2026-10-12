import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver =new ChromeDriver();
 driver.manage().window().maximize();
 
 driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
 Thread.sleep(3000);
 
 Actions actions =new Actions(driver);
 
 WebElement dragableBox =driver.findElement(By.id("draggable"));
 WebElement droppableBox=driver.findElement(By.id("droppable"));
 
 actions.clickAndHold(dragableBox).moveToElement(droppableBox).release().perform();
 Thread.sleep(2000);
 
 WebElement e =driver.findElement(By.id("drop-status"));
 System.out.println(e.getText());
 
 driver.quit();
 
	}

}
