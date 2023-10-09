import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class WebDriverCommandsDemo {
    WebDriver d;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
    }

//    @Test
//    public void testGetCommands(){
//        d.get("https://www.bbc.co.uk/");
//        System.out.println(d.getTitle());
//        System.out.println(d.getCurrentUrl());
//        System.out.println(d.getPageSource());
//        System.out.println(d.getWindowHandle());
//        d.close();
//    }

//@Test
//    public void testCAndQuit(){
//        d.get("https://demoqa.com/browser-windows");
//        d.findElement(By.xpath("//button[@id='tabButton']")).click();
//        d.findElement(By.xpath("//button[@id='windowButton']")).click();
//        d.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
//        System.out.println(d.getWindowHandles().size());
//    }

    //@Test
//    public void testNavigateCommands(){
//        d.get("https://en-gb.facebook.com/");
//        System.out.println("current URl " + d.getCurrentUrl());
//        d.navigate().to("https://www.bbc.co.uk/");
//        System.out.println("URl navigate to " + d.getCurrentUrl());
//        d.navigate().back();
//        System.out.println("URl navigate back to " + d.getCurrentUrl());
//        d.navigate().forward();
//        System.out.println("URl navigate forward to " + d.getCurrentUrl());
//        d.navigate().refresh();
//   }

//    @Test
//    public void testShadowDom() {
//        d.get("https://shop.polymer-project.org/");
//        WebElement shadowHost = d.findElement(By.tagName("shop-app"));
//        JavascriptExecutor js = (JavascriptExecutor)d;
//        WebElement shadowDom = (WebElement)js.executeScript("return arguments[0].shadowRoot",shadowHost);
//        WebElement ironPages = shadowDom.findElement(By.tagName("iron-pages"));
//        WebElement shadowHome = ironPages.findElement(By.name("home"));
//        WebElement shadowDom2 = (WebElement)js.executeScript("return arguments[0].shadowRoot", shadowHome);
//        WebElement div = shadowDom2.findElement(By.tagName("div"));
//        WebElement element = div.findElement(By.tagName("shop-button"));
//        element.findElement(By.tagName("a")).click();
//    }


//    @Test
//    public void testWindowHandles(){
//        d.get("C:\\Users\\prath\\OneDrive\\Desktop\\html\\closeAndQuit.html");
//        d.findElement(By.linkText("Visit BBC")).click();
//        d.findElement(By.linkText("Visit SkySports")).click();
//        d.findElement(By.linkText("Visit NDTV")).click();
//        d.findElement(By.linkText("Visit Google")).click();
//        Set<String> windowHandles = d.getWindowHandles();
//
//        for(String id: windowHandles){
//            System.out.println("ID" + id);
//            String title = d.switchTo().window(id).getTitle();
//            if(title.contains("skysports"))
//                break;
//        }
//    }

//@Test
//    public void testFrame() {
//    d.get("https://demoqa.com/nestedframes");
////    //System.out.println(d.findElement(By.id("sampleHeading")).getText());
////    System.out.println(d.findElement(By.tagName("iframe")).getSize());
////    d.switchTo().frame(1);
////    String sampleHeading = d.findElement(By.id("sampleHeading")).getText();
////    System.out.println(sampleHeading);
//    int countIframesInPage = d.findElements(By.tagName("iframe")).size();
//    System.out.println("Number of Frames on a Page:" + countIframesInPage);
//    WebElement frame1=d.findElement(By.id("frame1"));
//    d.switchTo().frame(frame1);
//    WebElement frame1Element= d.findElement(By.tagName("body"));
//    String frame1Text=frame1Element.getText();
//    System.out.println("Frame1 is :"+frame1Text);
//    int countIframesInFrame1 =d.findElements(By.tagName("iframe")).size();
//    System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
//    d.switchTo().frame(0);
//    int countIframesInFrame2 =d.findElements(By.tagName("iframe")).size();
//    System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
//
//    d.close();
//
//}

//    @Test
//    public void testSimpleAlerts(){
//        d.get("https://demoqa.com/alerts");
//        d.manage().window().maximize();
//        d.findElement(By.id("alertButton")).click();
//        Alert simpleAlert = d.switchTo().alert();
//        simpleAlert.accept();
//
//    }

//    @SneakyThrows
//    @Test
//    public void testPromptAlert(){
//        d.get("https://demoqa.com/alerts");
//         d.manage().window().maximize();
//         WebElement element = d.findElement(By.id("promtButton"));
//        ((JavascriptExecutor)d).executeScript("arguments[0].click()", element);
//        Alert promptAlert = d.switchTo().alert();
//        String alertText = promptAlert.getText();
//        System.out.println("Alert text is " + alertText);
//        promptAlert.sendKeys("iabuasbduasubsaubasd");
//        Thread.sleep(50);
//        promptAlert.accept();
//    }
//@Test
//    public void testAlertWithNoUserAndPassword(){
//        d.get("https://www.rediff.com/");
//        d.manage().window().maximize();
//        d.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
//    d.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
//
//        Alert alert = d.switchTo().alert();
//    System.out.println(alert.getText());
//    Assert.assertEquals("Please enter a valid user name",alert.getText());
//    alert.dismiss();
//
//}

//    @Test
//    public void testHTTPWithCredentials() {
//        d.get("http://the-internet.herokuapp.com/basic_auth");
//        d.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
//        Assert.assertEquals("Congratulations! You must have the proper credentials.", d.findElement(By.tagName("p")).getText());
//
//    }

//@Test
//    public void testEnterTextUsingJSExecutor(){
//        d.get("https://www.facebook.com/");
//        JavascriptExecutor js = (JavascriptExecutor) d;
//        d.findElement(By.cssSelector("button[data-cookiebanner=accept_button")).click();
//        js.executeScript("document.getElementById('email').value=\"adnan@gmail.com\"");
//
//}

//    @SneakyThrows
//    @Test
//    public void testFlashUsingJSExecutor(){
//        d.get("https://www.orangehrm.com/");
//        WebElement element = d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button"));
//        JSExecutorUtil.drawBorder(element, d);
//        File screenshotAs = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
//        File target = new File("C:\\screenshot\\HRM.jpg");
//        FileUtils.copyFile(screenshotAs, target);
//    }
//@Test
//    public void testCaptureTitle(){
//        d.get("https://www.orangehrm.com/");
//    System.out.println(d.getTitle());
//    System.out.println(JSExecutorUtil.getTitle(d));
//}

//    @Test
//    @SneakyThrows
//    public void testCheckBox() {
//        d.get("C:\\Users\\prath\\OneDrive\\Desktop\\html\\CheckBoxRadio.html");
////    WebElement radioTestingBtn = d.findElement(By.xpath("//input[@type='radio' and @value='Testing']"));
////    if(!radioTestingBtn.isSelected()){
////        radioTestingBtn.click();
//
//        WebElement radioTestingBtn = d.findElement(By.xpath("//input[@type='radio' and @value='Java']"));
//        if (!radioTestingBtn.isEnabled()) {
//            System.out.println("Java button is disabled");
//
//        }
//
//
//    }

//    @Test
//    public void testDropDownRadio(){
//        d.get("https://www.jobserve.com/gb/en/Job-Search/");
//        String location = d.findElement(By.xpath("//*[@id=\"txtLoc\"]")).getText();
//        WebElement distance = d.findElement(By.id("selRad"));
//        Select distanceSelection = new Select(distance);
//        distanceSelection.selectByVisibleText("Within 15 miles");
//
//        Select adAge = new Select(d.findElement(By.id("selAge")));
//        adAge.selectByIndex(5);
//        Select jobType = new Select(d.findElement(By.id("selJType")));
//        jobType.selectByValue("2");
//        d.findElement(By.id("txtKey")).sendKeys("Selenium,sponsorship");
//        d.findElement(By.id("btnSearch")).click();
//        String text =d.findElement(By.xpath("//*[@id=\"pg\"]/div[1]/div[6]/div[5]")).getText();
//        System.out.println(text);
//        assertTrue(text.contains("jobs for Selenium" + location));

    //}


//@Test
//    public void testDate() throws InterruptedException {
//    String expectedDate = "10-August-2023";
//    String[] dateArray = expectedDate.split("-");
//    String eMonth = dateArray[1];
//    String eDate = dateArray[0];
//    String eYear = dateArray[2];
//    d.get("https://www.spicejet.com/");
//    d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]")).click();
//    String month = d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[1]/div")).getText();
//
//    List<WebElement> dates = d.findElements(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[5]/div/div"));
//    System.out.println("Date: " + dates.size());
//    for(WebElement e: dates){
//        if(e.getText().trim().equals(eDate)){
//            e.click();
//            break;
//        }
//    }
//    }

//    @Test
//    @SneakyThrows
//    public void testImplicitWait(){
//        d.get("https://www.google.com/");
//        d.manage().window().maximize();
//        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        d.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
//        d.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
//        d.findElement(By.name("q")).sendKeys("Automation");
//        //d.findElement(By.xpath("abc"));
//
////        WebDriverWait wait = new WebDriverWait(d,20);
////        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Odp5De\"]/div/div[1]/div/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div[1]/a/h3='Automation'")));
//
//
//
//
//    }


//    @Test
//public void testKeyEventsWithShiftKey(){
//        d.get("https://demoqa.com/auto-complete/");
//        WebElement element = d.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]"));
//        Actions actions =new Actions(d);
//        actions.keyDown(element, Keys.SHIFT);
//        actions.sendKeys("We can succeed when our efforts are more than our excuses");
//        actions.keyUp(Keys.SHIFT);
//        actions.build().perform();
//    }

//    @Test
//    public void testKeyEventsForCtrlCCtrlV(){
//        d.get("https://demoqa.com/text-box");
//        d.manage().window().maximize();
//        Actions actions = new Actions(d);
//        WebElement fullName = d.findElement(By.id("userName"));
//        fullName.sendKeys("Mr.Peter Haynes");
//        WebElement email = d.findElement(By.id("userEmail"));
//        email.sendKeys("peterHaynes@qa.com");
//        WebElement currentAddress = d.findElement(By.id("currentAddress"));
//        currentAddress.sendKeys("43 school lane London");
//        actions.keyDown(currentAddress, Keys.CONTROL);
//        actions.sendKeys("a");
//        actions.keyUp(currentAddress,Keys.CONTROL);
//        actions.build().perform();
//
//        actions.keyDown(Keys.CONTROL);
//        actions.sendKeys("c");
//        actions.keyUp(Keys.CONTROL);
//        actions.build().perform();
//
//        actions.sendKeys(Keys.TAB);
//        actions.build().perform();
//
//        actions.keyDown(Keys.CONTROL);
//        actions.sendKeys("v");
//        actions.keyUp(Keys.CONTROL);
//        actions.build().perform();
//
//        WebElement permanentAddress = d.findElement(By.id("permanentAddress"));
//        Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
//   }

//@Test
//    public void testMouseRightClick(){
//        d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        d.manage().window().maximize();
//        Actions actions = new Actions(d);
//        WebElement btnElement = d.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//        actions.contextClick(btnElement).perform();
//    System.out.println("Right click context menu displayed");
//
//    WebElement elementOpen = d.findElement(By.xpath("//span[text()='Copy']"));
//    elementOpen.click();
//    d.switchTo().alert().accept();
//    System.out.println("right click alert accepted");
//}

//@Test
//    public void testDoubleClick(){
//        d.get("https://demoqa.com/buttons/");
//    System.out.println("DemoQa web page displayed");
//    d.manage().window().maximize();
//    Actions actions = new Actions(d);
//    WebElement btnElement = d.findElement(By.id("doubleClickBtn"));
//    actions.doubleClick(btnElement).perform();
//    //Assert.assertEquals("You have done a double click", d.findElement(By.id("You have done a double click")));
//}



//@Test
//    public void testMaxFrequency(){
//        String name = "Afghaggggggnistan";
//        Map<Character,Integer> map = new HashMap<>();
//        char[] chars = name.toCharArray();
//        for(char c:chars){
//            int count =0;
//            if(map.get(c) == null){
//                map.put(c, ++count);
//            }
//            else
//            {
//                count = map.get(Character.valueOf(c));
//                map.put(c, ++count);
//            }
//        }
//
//        int max =0;
//        Character charWithMaxFrequency=null;
//        for(Map.Entry e: map.entrySet()){
//            Integer value =(Integer)e.getValue();
//            if (value>max){
//                max = value;
//                charWithMaxFrequency=(Character)e.getKey();
//            }
//        }
//    System.out.println(map);
//    System.out.println(charWithMaxFrequency);
//}
//@Test
//    public void testMouseHoverAction(){
//        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        d.manage().window().maximize();
//        //d.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
//    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Actions actions = new Actions(d);
//        d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
//        d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
//         d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//
//    WebElement adminElement = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
//    actions.moveToElement(adminElement).click().perform();
//    WebElement userMgmt = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
//    actions.moveToElement(userMgmt).click().perform();
//    WebElement users = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li/a"));
//    actions.moveToElement(users).click().perform();
//
//    }

    @Test
    public void testToolTipDemo(){
        d.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
        System.out.println("tooltip demo");
        d.manage().window().maximize();
        WebElement toolTipButton = d.findElement(By.linkText("Hover over me"));
        Actions ac = new Actions(d);
        ac.moveToElement(toolTipButton).perform();
        // String toolTipText = d.findElement(By.xpath("//*[@id=\"tooltip703601\"]/div[2]")).getText();
        //System.out.println("Retrieved tool tip is " + toolTipText);

        //Assert.assertEquals("Hooray", toolTipText);
    }

}
