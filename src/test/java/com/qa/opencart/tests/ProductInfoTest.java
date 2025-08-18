package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ProductInfoTest extends BaseTest{

    //BT(chrome+url) --> BC(login) --> @Test

    @BeforeClass
    public void prodInfoSetup() {
        accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
    }


    @DataProvider
    public Object[][] getProducts() {
        return new Object[][] {
                {"macbook", "MacBook Pro"},
                {"samsung", "Samsung SyncMaster 941BW"},
                {"imac", "iMac"},
                {"canon", "Canon EOS 5D"}
        };
    }

    @Test(dataProvider = "getProducts")
    public void productHeaderTest(String searchKey, String productName) {
        searchResultsPage = accPage.doSearch(searchKey);
        productInfoPage = searchResultsPage.selectProduct(productName);
        String actHeader = productInfoPage.getProductHeader();
        Assert.assertEquals(actHeader, productName);
    }


    @DataProvider
    public Object[][] getProductImages() {
        return new Object[][] {
                {"macbook", "MacBook Pro", 4},
                {"samsung", "Samsung SyncMaster 941BW", 1},
                {"canon", "Canon EOS 5D", 3}
        };
    }


    @Test(dataProvider = "getProductImages")
    public void productImagesCountTest(String searchKey, String productName, int imageCount) {
        searchResultsPage = accPage.doSearch(searchKey);
        productInfoPage = searchResultsPage.selectProduct(productName);
        int actImagesCount = productInfoPage.getProductImages();
        Assert.assertEquals(actImagesCount, imageCount);
    }




}
