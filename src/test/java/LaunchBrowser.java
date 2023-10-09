import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver d = new ChromeDriver();
        d.get("https://www.bbc.com");
        if (d.getTitle().startsWith("BBC")) {
            System.out.println("Chrome launch test case passed");
        }
        else
        {
            System.out.println("Chrome launch test case failed");
    }
}
}
