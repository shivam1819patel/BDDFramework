
package org.example;

        import org.openqa.selenium.By;

public class LogInPage extends Utils{
    private By _email = By.cssSelector("input.email");
    private By _password = By.id("Password");
    private By _loginButton = By.xpath("//button[text()='Log in']");
    LoadProp loadProp = new LoadProp();
    public void fillInLoginDetails(){

        //type email
        typeText(_email,loadProp.getProperty("email")+loadProp.getProperty("email_Domain"));

        //type password
        typeText(_password,loadProp.getProperty("password"));

        //click on login button
        clickOnElement(_loginButton);
    }
}
