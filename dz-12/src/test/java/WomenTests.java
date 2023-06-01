import com.tyshchenko.genders.Man;
import com.tyshchenko.genders.Women;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomenTests {


    Man man = new Man("Igor","Antonenko", 68,true);

    @Test(groups = {"methods"}, dataProvider = "WomenData", dataProviderClass = TestDataProvider.class)
    public void testIfWomenRetired(String firstname, String lastname, int age, Boolean partner, String previousname) {
        Women women = new Women(firstname,lastname,age,partner,previousname);
        Assert.assertEquals(women.isRetired(), true, "this Women is retired");
    }

    @Test(groups = {"methods"}, dataProvider = "WomenData",dataProviderClass = TestDataProvider.class)
    public void testRegisterPartnership(String firstname, String lastname, int age, Boolean partner, String previousname) {
        Women women = new Women(firstname,lastname,age,partner,previousname);
        women.registerPartnership(man);
        Assert.assertEquals(women.lastName, "Antonenko", "lastname was changed");
    }

    @Test(groups = {"methods"},dataProvider = "WomenData", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnership(String firstname, String lastname, int age, Boolean partner, String previousname) {
        Women women = new Women(firstname,lastname,age,partner,previousname);
        women.registerPartnership(man);
        women.deregisterPartnership(man);
        Assert.assertEquals(women.lastName, lastname);
    }

    @Test(groups = {"getset"},dataProvider = "WomenData", dataProviderClass = TestDataProvider.class)
    public void setPreviousLastNameWomenTest(String firstname, String lastname, int age, Boolean partner, String previousname) {
        Women women = new Women(firstname,lastname,age,partner,previousname);
        women.setPreviousLastname("Krabovenko");
        Assert.assertEquals(women.getPreviousLastname(),"Krabovenko");
    }

    @Test(groups = {"getset"},dataProvider = "WomenData", dataProviderClass = TestDataProvider.class)
    public void getPreviousLastnameWomenTest(String firstname, String lastname, int age, Boolean partner, String previousname) {
        Women women = new Women(firstname,lastname,age,partner,previousname);
        Assert.assertEquals(women.getPreviousLastname(),previousname);
    }

}
