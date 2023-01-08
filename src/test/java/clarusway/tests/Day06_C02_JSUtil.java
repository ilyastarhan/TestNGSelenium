package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day06_C02_JSUtil extends BaseCrossBrowserTest {


    @Test
    public void test(){
        JSUtils.driver = driver;
      //  Go to URL: https://www.amazon.com/
        driver.get("https://www.amazon.com/");
      //  Scroll in to view Amazon Ignite WebElement.
        JSUtils.scrollIntoViewJS(driver.findElement(By.partialLinkText("Amazon Ignite")));

      // Scroll up search area WebElement.
        JSUtils.scrollIntoViewJS(driver.findElement(By.id("twotabsearchtextbox")));
      //  Then flashing the background color.
        JSUtils.flash(driver.findElement(By.id("twotabsearchtextbox")));
    }
}
