import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;
import java.util.logging.Logger;

public class LoginScenarioTest extends BaseSetUp {
    private Logger log = Logger.getLogger(Log.class.getName());

    private WebDriver d;
    private Properties p;

    @Before
    public void setup(){
        d = getWebDriver();
        p = getObjRepo();
        log.info("child class before called");
    }

   

    @Test
    public void testSuccessfulLogin(){
        log.info("......staring testSuccessfulLogin.....");
        d.get(p.get("url").toString());
        WebElement uName = d.findElement(By.xpath(p.get("username").toString()));
        uName.sendKeys(p.get("uname_val").toString());
        WebElement uPassword = d.findElement(By.xpath(p.get("password").toString()));
        uName.sendKeys(p.get("upass_val").toString());
        WebElement loginButton = d.findElement(By.xpath(p.get("login_btn").toString()));
        loginButton.click();
        //WebElement element = d.findElement(By.xpath(p.get("product_label").toString()));
        //WebElement element1 = d.findElement(By.xpath(p.get(//*[@id="inventory_item_container"]/div/div/div[2]/div[1])))
       // Assert.assertTrue(element.isDisplayed());
    }

    public Properties getObjRepo() {
        return objRepo;
    }

    public void setObjRepo(Properties objRepo) {
        this.objRepo = objRepo;
    }
}
