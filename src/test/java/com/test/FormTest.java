package com.test;

import com.baseclass.BaseClass;
import com.instaleap.pages.FormPage;
import org.testng.annotations.Test;

//SIN TERMINAR NO VALIDAR

public class FormTest extends BaseClass {
    @Test
    public void registerForm(){
        FormPage formPage = new FormPage(driver);
        formPage.goTo();
        formPage.setName("userexample");
        formPage.setLastName("lasnameexample");
        formPage.setEmail("user@gmail.com");
        formPage.setGender();
        formPage.setPhoneNumber("3198765672");
        formPage.setHobbieCheck();
        formPage.setCurrentAddress("Street 123 #25-12");
        formPage.setState();
    }
}
