package com.instaleap.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//SIN TERMINAR NO VALIDAR

public class FormPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id="firstName")
    private WebElement name;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(id="userEmail")
    private WebElement email;

    @FindBy(xpath="//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement genderSelector;

    @FindBy(id="userNumber")
    private WebElement phoneNumber;

    @FindBy(xpath="//*[@id=\"subjectsContainer\"]/div")
    private WebElement subjects;

    @FindBy(xpath="//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    private WebElement hobbieCheck;

    @FindBy(id="currentAddress")
    private WebElement currentAddress;

    @FindBy(xpath="//*[@id=\"state\"]")
    private WebElement state;

    @FindBy(id="city")
    private Select city;

    @FindBy(id="submit")
    private WebElement submitBtn;

    public FormPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://demoqa.com/automation-practice-form");
    }

    public void setName(String nameTest){
        wait.until(ExpectedConditions.visibilityOf(name));
        this.name.sendKeys(nameTest);
    }

    public void setLastName(String lastNameTest){
        wait.until(ExpectedConditions.visibilityOf(lastName));
        this.lastName.sendKeys(lastNameTest);
    }

    public void setEmail(String emailTest){
        wait.until(ExpectedConditions.visibilityOf(email));
        this.email.sendKeys(emailTest);
    }

    public void setGender(){
        wait.until(ExpectedConditions.visibilityOf(genderSelector));
        this.genderSelector.click();
    }

    public void setPhoneNumber(String phoneNumberTest){
        wait.until(ExpectedConditions.visibilityOf(phoneNumber));
        this.phoneNumber.sendKeys(phoneNumberTest);
    }

    public void setHobbieCheck(){
        wait.until(ExpectedConditions.visibilityOf(hobbieCheck));
        this.hobbieCheck.click();
    }

    public void setCurrentAddress(String address){
        wait.until(ExpectedConditions.visibilityOf(currentAddress));
        this.currentAddress.sendKeys(address);
    }

    public void setState(){
        wait.until(ExpectedConditions.visibilityOf(state));
        this.state.click();
        driver.findElement(By.id("react-select-3-option-0")).click();
    }

}
