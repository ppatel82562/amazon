package CucumberPractise;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;


public class Hooks extends Utils {
    Browser_Factory browser_factory =new Browser_Factory();
    HomePage nop_commerce =new HomePage();

@Before
public void set_up_Browser(){
    browser_factory.selectBrowser();
    nop_commerce.getUrl();
    driver.manage().deleteAllCookies();

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
@After
        public void closeBrowser(){
//    public void closeBrowser(ITestResult result){
//    if (ITestResult.FAILURE == result.getStatus()){
//        captureScreenShot("register"+randomDate());
//
//    }

        driver.close();
    }
}
