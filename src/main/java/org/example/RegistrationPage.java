
package org.example;

        import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    private By _FirstName= By.id("FirstName");
    private By _Lastname= By.id("LastName");

    private By _DateOfBirth= By.xpath("//div[@class='date-picker-wrapper']/select");
    private By _MonthOfBirth= By.xpath("//div[@class='date-picker-wrapper']/select[2]");
    private By _YearOfBirth= By.xpath("//div[@class='date-picker-wrapper']/select[3]");
    private By _Email = By.id("Email");
    private By _Password =By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    By _clickCheckoutAsGuest= By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    public void filldetailsforregistration(){
        //Type First Name
        typeText(_FirstName, "TestFirstname");
        //Type Last name
        typeText(_Lastname, "TestLastName");
        //select date
        selectByIndex(_DateOfBirth, 11);
        //select month
        selectByText(_MonthOfBirth, "April");
        //select year
        selectByValue(_YearOfBirth, "1999");
        //Type Email address
        typeText(_Email, "Testmail+" + timestamp() + "@gmail.com");
        //Type password
        typeText(By.id("Password"), "Test1234");
        //Type confirm password
        typeText(By.id("ConfirmPassword"), "Test1234");
        //click on register submit button
        clickOnElement(By.name("register-button"));
    }
    public void signInPage(){
        clickOnElement(_clickCheckoutAsGuest);

    }
}
