package com.instaleap.pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MillionAndUpPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id="lnkMenuContact")
    private WebElement lnkMenuContact;

    @FindBy(xpath="//span[contains(text(),'Buying or Selling a Property')]")
    private WebElement buyOrSellBtn;

    @FindBy(id="BuyingOrSellingProperty-email")
    private WebElement email;

    @FindBy(id="BuyingOrSellingProperty-name")
    private WebElement name;

    @FindBy(id="BuyingOrSellingProperty-phone")
    private WebElement phone;

    @FindBy(xpath="//button[contains(@class,'lead__btn-send btn btn-black btn-send-lead lead__btn-send--modal btn--md')]//span")
    private List<WebElement> sendBtn;

    @FindBy(xpath="//*[@id=\"modal-response\"]/div/div/div[4]/div[2]/div[1]/div[1]/p")
    private WebElement validationText;


    public MillionAndUpPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://newdesign.millionandup.com/");
    }

    public void contactUs(){
        wait.until(ExpectedConditions.visibilityOf(lnkMenuContact));
        this.lnkMenuContact.click();
    }

    public void buyOrSell(){
        wait.until(ExpectedConditions.visibilityOf(buyOrSellBtn));
        this.buyOrSellBtn.click();
    }

    public void setEmail(String userEmail){
        wait.until(ExpectedConditions.visibilityOf(email));
        this.email.sendKeys(userEmail);
    }

    public void setName(String userName){
        wait.until(ExpectedConditions.visibilityOf(name));
        this.name.sendKeys(userName);
    }

    public void setPhone(String userPhone){
        wait.until(ExpectedConditions.visibilityOf(phone));
        this.phone.sendKeys(userPhone);
    }

    public void sendInfo(){
        wait.until(ExpectedConditions.visibilityOf(sendBtn.get(1)));
        this.sendBtn.get(1).click();
    }

    public void verificationSend(){
        wait.until(ExpectedConditions.visibilityOf(validationText));
        String sendSuccesfully = this.validationText.getText();
        Assert.assertEquals(sendSuccesfully,"Your message was received, one of our agents will contact you shortly.");
    }

}
