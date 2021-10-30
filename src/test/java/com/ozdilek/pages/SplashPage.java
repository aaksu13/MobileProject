package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class SplashPage extends BaseTest {

    @Step("Uygulama Kontrol")
    public void checkOpen(){
        String checkText = findElement(MobileElements.startShopping).getText();
        Assert.assertEquals("ALIŞVERİŞE BAŞLA",checkText);
        Loger.info("Uygulamanın Düzgün Bir Şekilde Açıldığı Kontrol Edildi");
    }
}
