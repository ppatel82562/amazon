package CucumberPractise;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static CucumberPractise.BasePage.driver;

public class Utils {

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
    public static void selectByVisibleText(By by,String text){
        new Select(driver.findElement(by)).selectByVisibleText(text);

    }
    public static void selectbyIndex(By by,int number){
        new Select(driver.findElement(by)).selectByIndex(number);
    }

    public static void selectbyValue(By by,String value){
        new Select(driver.findElement(by)).selectByValue(value);
    }


}



