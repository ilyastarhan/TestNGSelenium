package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C03_DataProviderClass {




    @DataProvider(name = "testData")
    public Object[][] dataprovider(){
        Object[][] data = {
                {"First Test", "Birinci Test"},
                {"Second Test", "Ikinci Test"},
                {"Third Test", "Ucuncu Test"},
        };
        return data;
    }
}
