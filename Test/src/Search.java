import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Search {
   void googleSearch( WebDriver driver) {
        String exePath = "C:\\Users\\sourabv\\Pictures\\Autoreassginproject\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement searchtextfiled=driver.findElement(By.name("q"));
        searchtextfiled.sendKeys("Tajmahal Images");
        searchtextfiled.sendKeys(Keys.ENTER);

        WebElement images=driver.findElement(By.xpath("//a[contains(text(),'Images')]"));
        images.click();

        WebElement resultsimage=driver.findElement(By.partialLinkText("Taj Mahal"));

        resultsimage.click();

    }
}
