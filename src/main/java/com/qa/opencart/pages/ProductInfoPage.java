package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class ProductInfoPage {

    private WebDriver driver;
    private ElementUtil eleUtil;

    public ProductInfoPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }

    private final By header = By.tagName("h1");
    private final By productImages = By.cssSelector("ul.thumbnails img");

    public String getProductHeader() {
        String headerVal = eleUtil.waitForElementVisible(header, AppConstants.DEFAULT_SHORT_WAIT).getText();
        System.out.println("product header is --->"+ headerVal);
        return headerVal;
    }

    public int getProductImages() {
        int imagesCount =
                eleUtil.waitForElementsVisible(productImages, AppConstants.DEFAULT_MEDIUM_WAIT).size();
        System.out.println("Total number of images : "+ imagesCount);
        return imagesCount;
    }


}
