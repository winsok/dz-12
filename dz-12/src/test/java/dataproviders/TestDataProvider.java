package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "manData")
    public Object[][] manData() {
        return new Object [][] { {"Anton", "Ivasenko", 66, true}, {"Vladislav", "Borisenko", 77, true}};
    }


    @DataProvider(name = "womenData")
    public Object[][] WomenData() {
        return new Object [][] { {"Kate", "Ivasenko", 65, true}, {"Antonina", "Surname", 64, true}};
    }
}
