package com.test;

import com.baseclass.BaseClass;
import com.instaleap.pages.MillionAndUpPage;
import org.testng.annotations.Test;

public class MillionContactUsTest extends BaseClass {

    @Test
    public void moreInformation(){
        MillionAndUpPage millionAndUp = new MillionAndUpPage(driver);
        millionAndUp.goTo();
        millionAndUp.contactUs();
        millionAndUp.buyOrSell();
        millionAndUp.setEmail("usertest@instaleap.com");
        millionAndUp.setName("Usertest");
        millionAndUp.setPhone("3165727182");
        millionAndUp.sendInfo();
        millionAndUp.verificationSend();
    }
}
