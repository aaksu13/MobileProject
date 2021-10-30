package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class ShoppingPage extends BaseTest {

    @Step("Alışverişe Başla")
    public void clickStartShopping(){
        findElement(MobileElements.startShopping).click();
        Loger.info("Alışverişe Başla Seçeneğine Tıklandı");
    }

    @Step("Alışveriş Sayfası Kontrol")
        public void checkShopping(){
        String checkShop = findElement(MobileElements.checkShopping).getAttribute("resource-id");
        Assert.assertEquals("com.ozdilek.ozdilekteyim:id/relLayStore",checkShop);
        Loger.info("Alışveriş Sayfası Açıldığı Doğrulandı");
    }

}
