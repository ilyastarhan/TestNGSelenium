package clarusway.tests;

import clarusway.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Day05_C02_ITestListener.class)
public class Day05_C03_UseListener {

    @Test
    public void passedText() {
        System.out.println("passed Test");

    }

    @Test
    public void failedText() {
        System.out.println("failed Test");
        Assert.fail();

    }

    @Test(timeOut = 500)
    public void timedOutText() throws InterruptedException {
        System.out.println("Timed out Test");
        Thread.sleep(600);
    }

}
