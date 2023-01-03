package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C05_DataProviderExample extends BaseTest {


    @Test(dataProvider = "data-provider")
    public void test(String value) throws InterruptedException {
        //   Open the site: https://www.amazon.com/
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));


        //   Do it with DataProvider for
        //   Java
        //   JavaScript
        //   Phyton
        searchBox.sendKeys(value+ Keys.ENTER);
        Thread.sleep(3000);
    }

    @DataProvider(name = "data-provider" )
    public Object[][] dpMethod() {
        return new Object[][]{{"Java"}, {"JavaScript"}, {"Phyton"}};
    }


}
