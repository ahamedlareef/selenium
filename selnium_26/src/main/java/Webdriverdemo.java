import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Webdriverdemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("input[@value='Log in']")).click();
		Thread.sleep(2000);
		WebElement errormessage=driver.findElements(By.xpath("/span[contains(text();unsuccesful')]")).getFirst();
		System.out.println(errormessage);
		driver.quit();
	}
}
