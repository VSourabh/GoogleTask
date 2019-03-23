import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Serializable;

public class Demo1 {

    @Before
    public static void main(String[] args) {

        String exePath = "C:\\Users\\sourabv\\Pictures\\Autoreassginproject\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        GoogleLogin googleLogin =  new GoogleLogin();
        googleLogin.googleLogin(driver);

        Search search =  new Search();
        search.googleSearch(driver);

    }
}
