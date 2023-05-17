


package org.example;

        import org.openqa.selenium.By;

public class ProductHomePage extends Utils
{
    By _emailFriendButton=By.xpath("(//button[@class='button-2 email-a-friend-button'])");
    By _processorName= By.id("product_attribute_1");
    By _ramSize= By.id("product_attribute_2");

    By _hddSize= By.id("product_attribute_3_6");
    By _osSize= By.id("product_attribute_4_9");
    By _softwareNameMicrosoftOffice= By.id("product_attribute_5_10");
    By _softwareNameAcrobatReader= By.id("product_attribute_5_11");
    By _softwareNameTotalCommande = By.id("product_attribute_5_12");
    By _clickAddToCart= By.xpath("//button[@class='button-1 add-to-cart-button']");

    By _ClickOnlink =By.xpath("//a[@href='/cart']");


    public void clickEmailFriendbutton()
    {
        // find link email friend and click
        clickOnElement(_emailFriendButton);
    }

    public  void clickbuildYourOwnComputerDetails(){
        selectByText(_processorName,"2.2 GHz Intel Pentium Dual-Core E2200");
        selectByText(_ramSize,"8GB [+$60.00]");
        clickOnElement(_hddSize);
        clickOnElement(_osSize);
        clickOnElement(_softwareNameMicrosoftOffice);
        clickOnElement(_softwareNameAcrobatReader);
        clickOnElement(_softwareNameTotalCommande);
        clickOnElement(_clickAddToCart);
        clickOnElement(_ClickOnlink);

    }
}

