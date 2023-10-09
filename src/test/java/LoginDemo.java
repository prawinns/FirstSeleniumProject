import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.get("https://www.saucedemo.com/");

        WebElement uName = d.findElement(By.xpath("//*[@id=\"user-name\"]"));
        uName.sendKeys("standard_user");

        WebElement uPassword=d.findElement(By.xpath("//*[@id=\"password\"]"));
        uPassword.sendKeys("secret_sauce");

        WebElement loginButton = d.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();

    }
}
