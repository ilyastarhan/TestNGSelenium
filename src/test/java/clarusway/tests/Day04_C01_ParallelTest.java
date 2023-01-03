package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;
import java.time.Duration;
import java.util.List;

public class Day04_C01_ParallelTest extends BaseCrossBrowserTest {


    @Test()
    public void test01() {
        driver.get("https://www.google.com/");
    }

    @Test()
    public void test02() {
        driver.get("https://www.amazon.com/");

    }

    @Test()
    public void test03() {
        driver.get("https://www.trendyol.com/");

    }

}














