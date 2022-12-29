package clarusway.tests;

import org.testng.annotations.*;

public class Day01_C01_TestNGAnnotations {

    // @Before/After Suite
    // @Before/After Test
    // @Before/After Class
    // @Before/After Method

    @Test
    public void test01(){
        System.out.println("\t\t\t\tTest 1 calisti");
    }


    @Test
    public void test02(){
        System.out.println("\t\t\t\tTest 2 calisti");

    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite calisti");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite calisti");

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("\tBefore Test calisti");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("\tAfter Test calisti");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBefore Class calisti");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfter Class calisti");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\t\t\tBefore Method calisti");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("\t\t\tAfter Method calisti");

    }

}
