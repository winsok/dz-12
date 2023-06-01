import com.tyshchenko.genders.Man;
import com.tyshchenko.genders.Women;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManTests {
    
    @Test(groups = {"methods"}, dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testIfManRetired(String name,String lastname, int age, Boolean partner) {
        Man man = new Man(name,lastname,age,partner);
        Assert.assertEquals(man.isRetired(),true, "this Man is retired");
    }
}
