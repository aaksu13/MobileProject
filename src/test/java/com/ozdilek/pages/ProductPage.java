package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;

public class ProductPage extends BaseTest {
    @Step("Aşağı Kaydır")
    public void scrollDown() throws InterruptedException {
        scroll();
        scroll();
        Loger.info("Sayfa Aşağıya Kaydırıldı");
    }

    @Step("Rasgele Ürün Seçme")
    public void randomProduct(){
        randomSelect(MobileElements.selectProduct).click();
        Loger.info("Rasgele Bir Ürün Seçildi");
    }

}
