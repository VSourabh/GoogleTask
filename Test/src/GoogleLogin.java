import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLogin {

    void googleLogin( WebDriver driver) {
        driver.findElement(By.id("gb_70")).click();
        WebElement usrname=driver.findElement(By.id("identifierId"));
        usrname.sendKeys("svtd91@gmail.com");

        WebElement nxtbutton=driver.findElement(By.id("identifierNext"));
        nxtbutton.click();

        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));

        WebElement elementpwd = driver.findElement(By.xpath("//input[@type='password']"));
        elementpwd.sendKeys("Test@321");

        WebElement pwdnxtbutton=driver.findElement(By.id("passwordNext"));
        pwdnxtbutton.click();
    }
}
