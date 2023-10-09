import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;

public class DemoBrokenLinksTest extends BaseSetUp {
    private WebDriver driver;
    private Properties properties;

    @Before
    public void init(){
        if(driver == null)
            super.init();
        driver = getWebDriver();
        properties = getObjRepo();
    }

    @Test
    public void test(){
        driver.get("https://demoqa.com/broken");
        List <WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links " + links.size());

        for(int i =0;i<links.size();i++){
            WebElement E1 = links.get(i);
            String url = E1.getAttribute("href");
            verifyLinks(url);
        }

        for(WebElement we : links){
            String href = we.getAttribute("href");
            verifyLinks(href);
        }
    }
public static void verifyLinks(String linkUrl){
        try{
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode()>=400)
            {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage() + "is a broken link");
            }
            else {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage());
            }

        }
        catch (Exception e){

        }
}


}
