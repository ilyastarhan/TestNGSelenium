package clarusway.tests;

import clarusway.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day05_C01_HTMLReport extends BaseTestReport {


    @Test()
    public void test01() {
        extentTest = extentReports.createTest("Test01");
//        System.out.println("Test01 started at ");
        driver.get("https://www.google.com/");
        Assert.fail();
    }

    @Test
    public void test02() {
        extentTest = extentReports.createTest("test02");
        System.out.println("Test02 started at ");
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}