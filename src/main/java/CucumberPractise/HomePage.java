package CucumberPractise;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public void enterlogincredential (String uname,String pword){
        clear(By.id("txtUsername"));
        enterText(By.id("txtUsername"),uname);
        enterText(By.id("txtPassword"),pword);
        clickElement(By.id("btnLogin"));
    }

    }
