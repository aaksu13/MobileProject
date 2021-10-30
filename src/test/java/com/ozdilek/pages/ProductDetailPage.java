package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductDetailPage extends BaseTest {

    @Step("Ürün Detay Kontrol")
    public void checkProductDetail(){
        String checkProductDetail = findElement(MobileElements.checkProductDetail).getText();
        Assert.assertEquals("Listeme Ekle",checkProductDetail);
        Loger.info("Ürün Detay Sayfasına Gidildiği Doğrulandı");
    }

    @Step("Ürünü Favoriye Ekle")
    public void addFav(){
        findElement(MobileElements.clickFav).click();
        Loger.info("Favorilere Ekle Butotuna Tıklandı");
    }

    @Step("Ürünü Sepete Ekle")
    public void addCart(){
        if (findElement(MobileElements.checkBodySize).getAttribute("enabled").equals("true")){
            randomSelect(MobileElements.selectBodySize).click();
            findElement(MobileElements.addCart).click();
        }
        else {
            findElement(MobileElements.addCart).click();
        }
        Loger.info("Sepete Ekle Butonuna Tıklandı");
    }

}
