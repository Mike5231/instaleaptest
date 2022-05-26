package com.instaleap.pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooksPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath="//select[contains(text(),'')]")
    private WebElement rowsPerPage;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement nextBtn;

    @FindBy(id = "see-book-Understanding ECMAScript 6")
    private WebElement lastBook;

    @FindBy(id = "userName-value")
    private WebElement bookIsbn;

    public BooksPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://demoqa.com/books");
    }

    public void changePage(){
        this.nextBtn.click();
    }

    public void setRowsPerPage(){
        wait.until(ExpectedConditions.visibilityOf(rowsPerPage));
        Select rows = new Select(rowsPerPage);
        rows.selectByValue("5");
    }

    public void selectBook(){
        wait.until(ExpectedConditions.visibilityOf(lastBook));
        this.lastBook.click();
    }

    public void verificationBook(){
        wait.until(ExpectedConditions.visibilityOf(bookIsbn));
        String bookIsbn = this.bookIsbn.getText();
        Assert.assertEquals(bookIsbn,"9781593277574");
    }
}
