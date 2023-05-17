package org.example;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    private static String expectedRegistationCompleteMsg = "Your registration not completed";

    static String expectedVotesubmitMsg = "Your Vote Submited";
    static String expectedSendMailMsg = "Your Mail sent";

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String Text) {
        driver.findElement(by).sendKeys(Text);
    }

    public static String getTextFormElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void selectByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    public static void selectByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    public static void selectByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();

    }

    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new
                SimpleDateFormat("ddMMyymmss");
        return sdf.format(date);

    }
    public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public static void captureScreenShot(String fileName)
    {//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotsAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + ".png");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
