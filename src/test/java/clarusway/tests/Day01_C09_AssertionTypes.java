package clarusway.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {
    // Bir test methodu birden fazla attribute kullanilarak konfigure edilebilir

    @Test()
    public void hardAssertions() {
        System.out.println("Assertion öncesi calisiyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrasi calisiyor");

    }
    @Test()
    public void softAssertions() {
        System.out.println("Soft Assertion öncesi calisiyor");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertTrue(true);

        System.out.println("Soft Assertion sonrasi calisiyor");
        softAssert.assertAll("failed");// method sonunda kesinlikle cagrilmali
    }

}