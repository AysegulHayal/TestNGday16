package tests.day17_testNGFramework_assertions;

import org.testng.annotations.Test;

public class C05_SoftAssert {
    /*
    Test NG assertion konusunda da bize bir alternatif sunar
    TestNG iki farkli Assertion class ina sahiptir
    1- Assert
    Bu JUnitteki assertion ile bire bir aynidir.
    sadece isimlendirirken diger alternatif softAssert oldugundan Assert
    class ina da HARD ASSERT denir
    hard assert karsilastigi ilk failed da calismayi durdurur dolayisiyla geriye kalan assertlarin
    passed veya failed sonuclarindan hangisini alacagini bilemeyiz
    2- Soft Assert
    Soft Assert biz raporla diyene kadar yaptigi tum testlerin sonuclarini
    kendisi tutar test failed veya passed olsa calismaya devam eder
    ne zaman raporla
     */
@Test
    public void softAssertionTesti(){



}
}

