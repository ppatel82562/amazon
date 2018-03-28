package CucumberPractise;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Hooks extends BasePage {

@Before
public void openBrowser(){
    System.setProperty("webdriver.gecko.driver","src\\Resources\\Driver\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.get("http://opensource.demo.orangehrmlive.com/");
//    driver.manage().deleteAllCookies();

  //driver.get("http://demo.nopcommerce.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
@After
    public void closeBrowser(){

        driver.close();
    }
}
