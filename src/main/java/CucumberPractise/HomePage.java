package CucumberPractise;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class HomePage extends Utils {

    Load_Properties load_properties = new Load_Properties();
    String url = load_properties.getProperty("url");
    String product = load_properties.getProperty("product");

    public void getUrl() {
        driver.get(url);
    }

    public void serch_Product() {
        enterText(By.id("small-searchterms"), product);
        clickElement(By.xpath("//input[@value='Search']"));

    }
}


