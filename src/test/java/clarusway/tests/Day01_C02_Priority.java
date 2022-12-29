package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C02_Priority {

    // TestNG (default) olarak @Test annotationları alfabetik sıraya göre execute eder
    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir
    // Priporty attribute u icin negatif degerler kullanilabilir
    // TestNG default (varsayilan) priority = 0 dir

    @Test(priority = 1)
    public void test02() {
        System.out.println("Test02 calisti");

    }

    @Test(priority = 2)
    public void test04() {
        System.out.println("Test04 calisti");

    }

    @Test(priority = 3)
    public void test01() {
        System.out.println("Test01 calisti");

    }

    @Test(priority = 4)
    public void test03() {
        System.out.println("Test03 calisti");

    }
}
