package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "manData")
    public Object[][] manData() {
        return new Object [][] { {"Anton", "Ivasenko", 66, true}, {"Vladislav", "Borisenko", 77, true}};
    }


    @DataProvider(name = "WomenData")
    public Object[][] WomenData() {
        return new Object [][] { {"Kate", "Ivasenko", 64, true,"Ivasenko"}, {"Antonina", "Surname", 70, true, "Surname"}};
    }

    @DataProvider(name = "PersonData")
    public Object[][] personData() {
        return new Object [][] { {"Anton", "Ivasenko", 66, true}, {"Vladislav", "Borisenko", 77, false}};
    }

}
