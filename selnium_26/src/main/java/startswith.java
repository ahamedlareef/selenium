import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class startswith {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xpath-by-shreenibas.netlify.app/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[statrs-with(@id,user_')]")).sendKeys("lareef");
		Thread.sleep(4000);
		driver.quit();

	}

}
