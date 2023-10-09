import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowserTest {
    static Logger logger = Logger.getLogger(LaunchBrowserTest.class);
    private WebDriver d;

    @BeforeClass
    public static void init(){
        PropertyConfigurator.configure("log4j.properties");
        logger.info("performing intialization");
        WebDriverManager.chromedriver().setup();
        logger.trace("This is Trace");
        logger.debug("This is Debug");
        logger.info("This is Info");
        logger.warn("This is Warn");
        logger.error("This is Error");
        logger.fatal("This is Fatal");
    }

    @Test
    public void launchBrowser(){
        logger.info("launching browser");
        d = new ChromeDriver();
        d.get("https://www.bbc.com");
    }
    @After
    public void cleanUp(){
        logger.info("performing clean up");
        d.quit();
    }

}
