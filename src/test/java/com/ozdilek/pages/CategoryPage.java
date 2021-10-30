package com.ozdilek.pages;

import com.ozdilek.BaseTest;
import com.ozdilek.MobileElements;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class CategoryPage extends BaseTest {
    @Step("Katagori Sekmesi")
    public void clickCategory(){
        findElement(MobileElements.clickCategory).click();
        Loger.info("Kategori Sekmesine Tıklandı");
    }

    @Step("Kategori Sekmesi Kontrol")
    public void checkCategory(){
        String checkCategory = findElement(MobileElements.checkCategory).getAttribute("content-desc");
        Assert.assertEquals("Kategoriler",checkCategory);
        Loger.info("Kategori Sekmesine Tıklandığı Doğrulandı");
    }

    @Step("Kadın Kategorisi")
    public void clickWoman(){
        findElement(MobileElements.clikWoman).click();
        Loger.info("Kadın Kategorisine Tıklandı");
    }

    @Step("Pantolon Kategorisi")
    public void clickTrousers(){
        findElement(MobileElements.clikTrousers).click();
        Loger.info("Pantolon Seçeneğine Tıklandı");
    }

}
