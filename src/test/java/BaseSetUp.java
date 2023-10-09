import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Logger;

@Getter
@Setter
public class BaseSetUp {
    private static Logger log = Logger.getLogger(String.valueOf(BaseSetUp.class));
    private WebDriver webDriver = null;
    public static Properties objRepo = null;
    private static DriverManagerType browser = null;
    public static int count = 0;

    @Before
    @SneakyThrows
    public void init(){
        if (webDriver ==null){
            System.out.println("fully qualified name : " + browser.browserClass() );
            //Class<?> chromeClass = Class.forName(objRepo.get("browser").toString().toUpperCase());
            Class<?> chromeClass = Class.forName(browser.browserClass());
            webDriver = (WebDriver) chromeClass.newInstance();
        }
        log.info("Before of Parent class called");
    }

    @BeforeClass
    public static void setUpForAllTest(){
        PropertyConfigurator.configure("log4j.properties");
        log.info("before class");
        objRepo = loadObjectRepository();
        browser = DriverManagerType.valueOf(objRepo.get("browser").toString());
        WebDriverManager.getInstance(browser).setup();
    }
    @SneakyThrows
    private static Properties loadObjectRepository() {

        objRepo=new Properties();
        objRepo.load(new FileInputStream(new File("OR.properties")));
        return objRepo;
    }
    public Properties getObjRepo(){
        return objRepo;
    }

    @After
    public void cleanUp(){
        webDriver.quit();
    }

    @AfterClass
    public static void clean(){
        objRepo=null;
        log.info("number count" + count);
    }


}