package org.tests;


import dataproviders.TestDataProvider;
import org.application.Man;
import org.application.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GettersSettersTest {



    // Getters Tests
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void getNameManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        Assert.assertEquals(man.getFirstName(), firstname);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void getNameWomenTest(String firstname,String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        Assert.assertEquals(women.getFirstName(), firstname);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void getLastnameManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        Assert.assertEquals(man.getLastName(), lastname);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void getLastnameWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        Assert.assertEquals(women.getLastName(), lastname);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void getAgeManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        Assert.assertEquals(man.getAge(), age);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void getAgeWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        Assert.assertEquals(women.getAge(), age);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void getPartnerManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        Assert.assertEquals(man.getPartner(), partner);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void getPartnerWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        Assert.assertEquals(women.getPartner(), partner);
    }

    // Setters Tests

    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void setNameManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        man.setFirstName(firstname);
        Assert.assertEquals(man.getFirstName(), firstname);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void setNameWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        women.setFirstName(firstname);
        Assert.assertEquals(women.getFirstName(), firstname);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void setLastnameManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        man.setLastName(lastname);
        Assert.assertEquals(man.getLastName(), lastname);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void setLastnameWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        women.setLastName(lastname);
        Assert.assertEquals(women.getLastName(),lastname);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void setAgeManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        man.setAge(age);
        Assert.assertEquals(man.getAge(),age);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void setAgeWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        women.setAge(age);
        Assert.assertEquals(women.getAge(),age);
    }
    @Test(dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void setPartnerManTest(String firstname, String lastname, int age, boolean partner) {
        Man man = new Man(firstname,lastname,age,partner);
        man.setPartner(partner);
        Assert.assertEquals(man.getPartner(),partner);
    }
    @Test(dataProvider = "womenData", dataProviderClass = TestDataProvider.class)
    public void setPartnerWomenTest(String firstname, String lastname, int age, boolean partner) {
        Women women = new Women(firstname,lastname,age,partner);
        women.setPartner(partner);
        Assert.assertEquals(women.getPartner(), partner);
    }

}
