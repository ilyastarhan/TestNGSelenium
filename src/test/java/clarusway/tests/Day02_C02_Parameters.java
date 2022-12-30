package clarusway.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C02_Parameters {

    @Test
    @Parameters({"name","double", "int2"})
    public void test01(String name, double a, int b){
        System.out.println("Hello " + name +a);
        System.out.println(a*b);
    }
}
