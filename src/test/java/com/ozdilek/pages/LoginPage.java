package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseTest {

    @Step("Üye Giriş Sayfası Kontrol")
    public void checkLogin(){
        String checkLogin = findElement(MobileElements.login).getText();
        Assert.assertEquals("Giriş Yap",checkLogin);
        Loger.info("Üye Giriş Sayfasının Açıldığı Doğrulandı");
    }

    @Step("Kullanıcı E-posta Girişi")
    public void sendEmail(){
        findElement(MobileElements.sendEmail).sendKeys("text");
        Loger.info("E-posta Girişi Yapıldı");
    }
    @Step("Kullanıcı Şifre Girişi")
    public void sendPassword(){
        findElement(MobileElements.sendPassword).sendKeys("şifre");
        Loger.info("Şifre Girişi Yapıldı");
    }
    @Step("Geri Dön")
    public void comeBackTwoTimes() throws InterruptedException {
        clickBack();
        TimeUnit.SECONDS.sleep(2);
        clickBack();
        Loger.info("Geçmiş Sekmelere Dönüş Sağlandı");
    }
}
