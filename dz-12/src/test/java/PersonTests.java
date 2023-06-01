import com.tyshchenko.genders.Person;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTests {

    //Getters
    @Test(groups = {"getset"}, dataProvider = "PersonData", dataProviderClass = TestDataProvider.class)
    public void getFirstNameTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        Assert.assertEquals(person.getFirstName(),firstname);
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void getLastNameTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        Assert.assertEquals(person.getLastName(),lastname);
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void getAgeTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        Assert.assertEquals(person.getAge(),age);
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void getPartnerTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        Assert.assertEquals(person.getPartner(),partner);
    }

    // Setters

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void setFirstNameTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        person.setFirstName("Denis");
        Assert.assertEquals(person.getFirstName(),"Denis");
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void setLastNameTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        person.setLastName("Ivanov");
        Assert.assertEquals(person.getLastName(),"Ivanov");
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void setAgeTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        person.setAge(50);
        Assert.assertEquals(person.getAge(),50);
    }

    @Test(groups = {"getset"},dataProvider = "PersonData",dataProviderClass = TestDataProvider.class)
    public void setPartnerManTest(String firstname, String lastname, int age, Boolean partner) {
        Person person = new Person(firstname,lastname,age,partner);
        person.setPartner(false);
        Assert.assertEquals(person.getPartner(),false);
    }
}

