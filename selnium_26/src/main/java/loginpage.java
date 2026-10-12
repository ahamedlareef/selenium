import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static <string> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver =new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://practicetestautomation.com/practice-test-login/");
 Thread.sleep(4000);
 driver.findElement(By.id("username")).sendKeys("");
 Thread.sleep(3000);
 driver.findElement(By.id("password")).sendKeys("password123");
 Thread.sleep(2000); 
 driver.findElement(By.className("btn")).click();
 String incorrectText=driver.findElement(By.className("show")).getText();
 System.out.println(incorrectText);
 Thread.sleep(2000);
 driver.findElement(By.id("usernmae")).sendKeys("student");
 driver.findElement(By.id("password")).clear();
 driver.findElement(By.id("password")).sendKeys("password123");
 driver.findElement(By.className("btn")).click();
 string currenturl=driver.getCurrentUrl();
 System.out.println(currenturl);
 String stringtitle = driver.findElement(By.className("post-title")).getText();
 
 
 
 
	}

}
