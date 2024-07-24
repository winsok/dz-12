package org.tests;


import org.application.Man;
import org.application.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GettersSettersTest {

    Man man = new Man("Igor","Ivanov", 69, true);
    Women women = new Women("Iryna","Antonenko",60,true);

    // Getters Tests
    @Test
    public void getNameTest() {
        Assert.assertEquals("Igor", man.getFirstName());
        Assert.assertEquals("Iryna", women.getFirstName());
    }
    @Test
    public void getLastnameTest() {
        Assert.assertEquals("Ivanov", man.getLastName());
        Assert.assertEquals("Antonenko", women.getLastName());
    }
    @Test
    public void getAgeTest() {
        Assert.assertEquals(69, man.getAge());
        Assert.assertEquals(60, women.getAge());
    }
    @Test
    public void getPartnerTest() {
        Assert.assertEquals(true, man.getPartner());
        Assert.assertEquals(true, women.getPartner());
    }

    // Setters Tests

    @Test
    public void setNameTest() {
        man.setFirstName("Vasya");
        Assert.assertEquals(man.getFirstName(), "Vasya");
        women.setFirstName("Svitlana");
        Assert.assertEquals(women.getFirstName(), "Svitlana");
    }
    @Test
    public void setLastnameTest() {
        man.setLastName("Pupkin");
        Assert.assertEquals(man.getLastName(), "Pupkin");
        women.setLastName("Pupkina");
        Assert.assertEquals(women.getLastName(),"Pupkina");
    }
    @Test
    public void setAgeTest() {
        man.setAge(61);
        Assert.assertEquals(man.getAge(),61);
        women.setAge(65);
        Assert.assertEquals(women.getAge(),65);
    }
    @Test
    public void setPartnerTest() {
        man.setPartner(false);
        Assert.assertEquals(man.getPartner(),false);
        women.setPartner(false);
        Assert.assertEquals(women.getPartner(), false);
    }



}
