package org.Selenium.google.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMapsPage {
    private WebDriver driver;
    @FindBy(css = "input[jslog=\"11886\"]")
    private WebElement searchInputField;
    public GoogleMapsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchInput(String address) {
        searchInputField.click();
        searchInputField.clear();
        searchInputField.click();
        searchInputField.sendKeys(address);
    }
}
