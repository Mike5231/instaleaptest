package com.test;

import com.instaleap.pages.BooksPage;
import com.baseclass.BaseClass;
import org.testng.annotations.Test;

public class BooksSearchTest extends BaseClass {

    @Test
    public void getABook(){
        BooksPage booksPage = new BooksPage(driver);
        booksPage.goTo();
        booksPage.setRowsPerPage();
        booksPage.changePage();
        booksPage.selectBook();
        booksPage.verificationBook();
    }
}
