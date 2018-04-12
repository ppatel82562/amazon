package CucumberPractise;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static CucumberPractise.BasePage.driver;

public class Utils extends BasePage {

    public static void clickElement (By by){

        driver.findElement(by).click();
    }
    public static void enterText (By by,String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);

    }

    public static void waitForElementVisible (By by, int time){
        WebDriverWait wait = new WebDriverWait (driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    public void clear(By by) {
        driver.findElement(by).clear();

    }
    public String randomDate (){

        DateFormat format = new SimpleDateFormat("ddMMMyyHHmmss");
        return format.format(new Date());
    }
    public static String randomNumber() {
        DateFormat format = new SimpleDateFormat("ddmmyy");
        return format.format(new Date());
    }
    public static void selectByVisibleText(By by,String text){
        new Select(driver.findElement(by)).selectByVisibleText(text);

    }
    public static void selectbyIndex(By by,int number) {
        new Select(driver.findElement(by)).selectByIndex(number);
    }

    public static void selectbyValue(By by,String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    public static WebElement waitForVisibility(WebDriver driver, By by, int waitTime) {
        Wait<WebDriver> wait = new WebDriverWait(driver, waitTime);
        WebElement divElement = wait.until((com.google.common.base.Function<? super WebDriver, WebElement>) ExpectedConditions.visibilityOfElementLocated(by));
        return divElement;
    }
    public static boolean isVisible(WebDriver driver, String eachField) {
        return (!driver.findElement(By.id(eachField)).isDisplayed());
    }
    public static WebElement switchToNewWindow(WebDriver driver, String iframeId) {
        driver.switchTo().frame(iframeId);
        WebElement window = driver.switchTo().activeElement();
        return window;
    }

    public static void captureScreenShot(String screenShotName) {

        try{
            TakesScreenshot tc=(TakesScreenshot)driver;
            File source = tc.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,new File("screenshot\\"+screenShotName+".png"));
            System.out.println("Screenshot has been taken");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot"+e.getMessage());
        }
    }
    public static void TakeFullPageScreenShot (String screenShotName) throws Exception{


        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "PNG", new File("screenshot\\" + screenShotName + ".png"));
        System.out.println("Full Screenshot has been taken");

    }
    public static void hoverEffect(By by, By by1) {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).build().perform();
        clickElement(by1);
    }
    public static boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } // try
        catch (Exception e) {
            return false;
        } // catch

    }

}





