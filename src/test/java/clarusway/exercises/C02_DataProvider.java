package clarusway.exercises;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class C02_DataProvider extends BaseTest {



    @Test(dataProvider = "data-provider")
    public void test(String name, String pass){
      // Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");
      // Login with negative credentilas by Data Provider.
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys(name);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(pass);
      // Then assert that ‘’Invalid credentials’’ is displayed.
    }
    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){

        return new Object[][] {{"Admin", "admin123"}};
    }
}
