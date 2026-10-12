import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class playyoutubesong {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("monica");
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[id=video-tittle']and //a[starts-with(@tittle, Monica ";
		

	}

}
