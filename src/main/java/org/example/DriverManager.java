package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    @BeforeMethod
    public static void openBrowser(){
        driver = new ChromeDriver();
        //For window size maximun
        driver.manage().window().maximize();
        //For wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public static void closeBrowser(){
        //for close browser
        driver.close();
    }

}
