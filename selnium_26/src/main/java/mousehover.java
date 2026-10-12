
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

    public static void main(String[] args) throws InterruptedException {

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open the practice URL
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        // 3. Find the Hoverable button
        WebElement hoverButton = driver.findElement(By.id("hoverable"));

        // 4. Find the status text element
        WebElement status = driver.findElement(
            By.id("status")
        );

        // 5. Create Actions object
        Actions actions = new Actions(driver);

        // 6. Move mouse onto the button
        actions.moveToElement(hoverButton).perform();

        // 7. Print status after hovering
        System.out.println("After Hover: " + status.getText());

        // 8. Find the Results Page link
        WebElement resultsLink = driver.findElement(
            By.linkText("Click for Results Page")
        );

        // 9. Move mouse away onto the link
        actions.moveToElement(resultsLink).perform();

        // 10. Print status after moving away
        System.out.println("After Moving Away: " + status.getText());

        // 11. Close browser
        driver.quit();
    }



	}


