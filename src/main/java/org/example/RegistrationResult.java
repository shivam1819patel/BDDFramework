


package org.example;

        import org.openqa.selenium.By;
        import org.testng.Assert;

public class RegistrationResult extends Utils
{
    static String expectedRegistationCompleteMsg= "Your registration not completed";

    private By _registrationMassage= (By.className("result"));

    public void verifyUserregistersucesfully()
    {
        //For getting massage
        String actualRegistationCompleteMsg = getTextFormElement(By.className("result"));
        System.out.println(actualRegistationCompleteMsg);
        Assert.assertEquals(expectedRegistationCompleteMsg, actualRegistationCompleteMsg, "Registration Failed");
    }

}

