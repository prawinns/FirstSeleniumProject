import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class LocatorsTest2 extends BaseSetUp {
    private Logger log = Logger.getLogger("LocatorsTest2.class");
    private WebDriver d;
    private Properties p;

    @Before
    public void setUp() {
        d = getWebDriver();
        p = getObjRepo();
        log.info("child class before called");
    }

    @Test
//    public void testLocatorUsingId(){
//        d.get("https://automationexercise.com/product_details/5");
//        d.manage().window().maximize();
//        WebElement searchElement = d.findElement(By.id("quantity"));
//        searchElement.click();
//    }

//    public void testLocatorUsingLinkText(){
//        d.get("https://www.bbc.co.uk/");
//        d.manage().window().maximize();
//       // WebElement linkTextElement = d.findElement(By.linkText("Sport"));
//        WebElement partialTextElement = d.findElement(By.partialLinkText("Cormac"));
//}

    //public void TestXPath() {
        //Relative xPath
//        d.get("https://www.saucedemo.com/");
//        d.manage().window().maximize();
//        d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//        d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//        d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();


       // public void TestXPathWithOptions(){

//            d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//            d.manage().window().maximize();
//            d.findElement(By.xpath("//input[contains(@name,'nam')]")).sendKeys("Admin");
//            //d.findElement(By.xpath("//input[contains(@name,\"pas\")]")).sendKeys("admin123");
//            //d.findElement(By.xpath("")).click();
        //
//        d.get("https://opensource-demo.orangehrmlive.com/");
//        d.manage().window().maximize();
//        d.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();




    //}

    public void testXPath(){
        d.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
        d.manage().window().maximize();
        String text = d.findElement(By.xpath("//a[contains(text(),'Suzlon Energy Ltd.')]/self::a/parent::td")).getText();
        System.out.println(text);

//        final List<WebElement> elements = d.findElements(By.xpath("//a[contains(text(),'Suzlon Energy Ltd.')]/self::a/ancestor::tr/child::td"));
//        System.out.println(elements.size());
//        Assert.assertEquals(4,elements.size());

//        final List<WebElement> elements = d.findElements(By.xpath("//a[contains(text(),'Suzlon Energy Ltd.')]/self::a/ancestor::tr/following::tr"));
//        System.out.println(elements.size());

//        final List<WebElement> elements = d.findElements(By.xpath("//a[contains(text(),'Suzlon Energy Ltd.')]/self::a/ancestor::tr/following-sibling::tr"));
//        System.out.println(elements.size());

        final List<WebElement> elements = d.findElements(By.xpath("//a[contains(text(),'Suzlon Energy Ltd.')]/self::a/ancestor::tr/preceding-sibling::*"));
         System.out.println(elements.size());

    }

}





