package clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C03_ParametersExample {

    String driver;
    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName) {
        //Driver konfigürasyonlari yapiliyor
        if (browserName.equals("chrome")) {
            //chrome konf yapildi
            driver = "chrome";
        } else if (browserName.equals("firefox")) {
            //firefox konf. yapildi
            driver = "firefox";
        } else {
            //opera konf yapildi
            driver = "opera";
        }
        System.out.println("driver objesi olusturuldu: " + driver);
    }
    @AfterMethod
    public void tearDown(){
        //Driver kapatiliyor
        driver = "-";
        System.out.println("driver sonlandirildi " + driver);
    }

    @Test
    public void test(){
        //Testimiz gerceklestiriliyor
        System.out.println("Test execution basladi");
        System.out.println("testte kullanilan driver :  " + driver);

    }
}
