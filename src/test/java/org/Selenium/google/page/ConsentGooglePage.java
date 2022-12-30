package org.Selenium.google.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsentGooglePage {
    private WebDriver driver;

    @FindBy(xpath = "//div[1]/form[2]/div/div/button/span")
    private WebElement acceptCookieBtn;

    public ConsentGooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookieBtn() {
        acceptCookieBtn.click();
    }
}
