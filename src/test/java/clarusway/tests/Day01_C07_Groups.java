package clarusway.tests;


import org.testng.annotations.Test;

public class Day01_C07_Groups {
    //groups attribute u sayesinde istedigimiz gruplara sahip test caselerini ozel olarak calistirabiliriz

    @Test(groups = {"smoke", "regression"})
    public void loginTest() {

    }

    @Test(groups = {"regression"})
    public void aboutTest() {

    }

    @Test(groups = {"regression"})
    public void contactTest() {

    }

    @Test(groups = {"smoke", "regression"})
    public void registrationTest() {

    }

    @Test(groups = {"smoke", "regression"})
    public void checkoutTest() {

    }
}