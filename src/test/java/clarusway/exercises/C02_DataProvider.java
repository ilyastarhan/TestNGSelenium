package clarusway.exercises;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_DataProvider extends BaseTest {


    @Test(dataProvider = "data", threadPoolSize = 2, invocationCount = 2, timeOut = 1000)
    public void testDataProvider(String username, String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement user = driver.findElement(By.name("username"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action.click(wait.until(ExpectedConditions.elementToBeClickable(user)))
                .sendKeys(username + Keys.TAB)
                .sendKeys(password + Keys.ENTER)
                .perform();

        WebElement invalid = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
        Assert.assertTrue(invalid.isDisplayed());
    }

    @DataProvider
    public Object[][] data() {

        return new Object[][]{
                {"admin", "123456"},
                {"madmin", "1234567"},
                {"badmin", "12345"}
        };
    }
}