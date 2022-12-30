package org.Selenium.google.page;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMapsPage {
    private WebDriver driver;
    @FindBy(id = "XmI62e")
    WebElement searchInputField;
    public GoogleMapsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchInput(String address) {
        searchInputField.clear();
        searchInputField.sendKeys(address);
    }
}
