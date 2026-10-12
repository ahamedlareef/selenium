import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class verifybuttonandratio {

	public static <Webriver> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demowebshop.tricentis.com/");
  Thread.sleep(3000);
  boolean isVisible=driver.findElement(By.id("vote-poll-1")).isDisplayed();
  System.out.println(isVisible);
  Thread.sleep(2000);
  boolean isSelect=driver.findElement(By.id("pollanswers-1")).isSelected();
  System.out.println(isSelect);
  driver.quit();
 
	}

}
