package org.tests;

import org.application.Man;
import org.application.Women;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManWomenTest {

    Man man = new Man("Kyrylo","Danilenko",67,false);
    Women women = new Women("Antonina","Vasylenko",68,false);

    @Test
    public void isRetiredTest() {
        Assert.assertEquals(man.isRetired(),true);
        Assert.assertEquals(women.isRetired(),true);
    };

    @Test
    public void registerPartnerShipTest() {
        women.registerPartnership(man);
        Assert.assertEquals(women.getLastName(),"Danilenko");
        Assert.assertEquals(women.getPartner(),true);
        Assert.assertEquals(man.getPartner(),true);
    }


}
