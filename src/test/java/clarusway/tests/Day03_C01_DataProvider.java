package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {


    @Test(dataProvider = "dataprovider")
    public void test01(String str){
        System.out.println(str);

    }

    @DataProvider
    public Object[][] dataprovider(){
        Object[][] data = {{"Karl"},{"Ortis"},{"Clarusway"}};
        return data;
    }
}
