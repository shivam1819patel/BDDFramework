

package org.example;

        import org.openqa.selenium.By;
        import org.testng.Assert;

public class EmailAFriendHomePage extends Utils
{
    private By _friendEmail = By.id("FriendEmail");
    private By _yourEmailAddress= By.id("YourEmailAddress");
    private By _personalMsg= By.id("PersonalMessage");

    public void verifyUsershouldSendMailToFriend()
    {
        typeText(By.id("FriendEmail"), "Friend" + timestamp() + "@gmail.com");
        //Type Your email address
        typeText(By.id("YourEmailAddress"), "Test+" + timestamp() + "@gmail.com");
        //Type Personal Massage
        typeText(By.id("PersonalMessage"), "Hello");
        //click send email button
        clickOnElement(By.xpath("(//button[@class='button-1 send-email-a-friend-button'])"));
        //getting massage
        String actualsendMailMsg= getTextFormElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
        System.out.println(actualsendMailMsg);
        Assert.assertEquals(expectedSendMailMsg,actualsendMailMsg,"Mail Send Fail");
    }
}

