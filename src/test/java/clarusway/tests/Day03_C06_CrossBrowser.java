package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {


    @Test
    public void crossBrowserTest(){
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
    }




}
