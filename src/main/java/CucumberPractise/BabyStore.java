package CucumberPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BabyStore extends Utils {

    public void navigateToBabyStore (){


        WebElement element = driver.findElement(By.id("nav-link-shopall"));     //Open Shop department and hold
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
        WebElement subelement = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[14]/span"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //wait for the element to be visible
        Actions act1 = new Actions(driver);                             //Open Toys and children section and hold
        act1.moveToElement(subelement).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //wait for the element to be visible

        clickElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[3]/div[14]/div/a[2]/span"));    //click on Baby

    }
}
