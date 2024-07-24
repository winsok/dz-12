package org.tests;

import dataproviders.TestDataProvider;
import org.application.Man;
import org.application.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManWomenTest {


    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider .class)
    public void isRetiredManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        Assert.assertEquals(man.isRetired(),true);
    };
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void isRetiredWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        Assert.assertEquals(women.isRetired(),false);
    };

    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void registerPartnerShipWomenTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man("Vasya", "Danilenko", 67, false);
        Women women = new Women(firstname,lastname,age,partner);
        women.registerPartnership(man);
        Assert.assertEquals(women.getLastName(),"Danilenko");
        Assert.assertEquals(women.getPartner(),true);
        Assert.assertEquals(man.getPartner(),true);
    }


}
