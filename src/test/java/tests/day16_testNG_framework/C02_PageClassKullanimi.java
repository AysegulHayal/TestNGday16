package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import static utilities.Driver.*;

public class C02_PageClassKullanimi {
    @Test
    public void nutellaTesti() {
        //amazona gidelim
        getDriver().get("https://www.amazon.com");
        //nutella icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // arama sonuclarinin nutella icerdigini test edelim
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        // driver' i kapatalim
        Driver.getDriver().close();
    }
}