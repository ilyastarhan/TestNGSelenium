package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute{


    @Test(
            threadPoolSize = 4,
            invocationCount = 7
    )
    public void test01() {
        System.out.println("Current thread Id = " + Thread.currentThread().getId());
    }



}














