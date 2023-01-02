package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {


    @Test(dataProvider = "dataprovider")
    public void test(String userName, String email, String password, int number){
        System.out.println(number + "\t" + userName + "\t" + email + "\t" + password );


    }

    @DataProvider
    public Object[][] dataprovider(){
        Object[][] data = {
                {"Karl", "karl@cw.com", "123", 1},
                {"Drake","drake@cw.com", "abc", 2 },
                {"Garry","garry@cw.com", "abc123", 3 },
                {"Elly", "elly@cw.com", "def123", 4}
        };
        return data;
    }
}
