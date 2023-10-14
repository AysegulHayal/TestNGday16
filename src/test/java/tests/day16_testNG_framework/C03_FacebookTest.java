package tests.day16_testNG_framework;

import org.testng.annotations.Test;
import utilities.Driver;

public class C03_FacebookTest {
    @Test
    public void FacebookTest(){
        Driver.getDriver().get("https://www.facebook.com/");
    }
}
