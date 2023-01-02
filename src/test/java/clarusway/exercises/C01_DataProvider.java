package clarusway.exercises;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProvider extends BaseTest {


    @Test(dataProvider = "data-provider")
    public void test(String value) throws InterruptedException {
    //   Open the site: https://www.amazon.com/
        Reporter.log("amazon sayfasina gidiliyor");
        driver.get("https://www.amazon.com");
        Reporter.log("arama butonu locate ediliyor");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));


        //   Do it with DataProvider for
    //   Java
    //   JavaScript
    //   Phyton
        Reporter.log("arama kutusuna degerler gönderiliyor");
        searchBox.sendKeys(value);
        Thread.sleep(3000);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Java"}, {"JavaScript"}, {"Phyton"}};
    }

}
