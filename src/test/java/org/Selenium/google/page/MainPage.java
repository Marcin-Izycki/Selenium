package org.Selenium.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(id = "L2AGLb")
    WebElement acceptCookieBtn;

    @FindBy(css = "svg[class=\"gb_0e\"]")
    WebElement appsGoogleList;

    @FindBy(xpath = "//div/ul[1]/li[3]/a/div/span")
    WebElement googleMapsApp;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookie() {
        acceptCookieBtn.click();
    }

    public void openGoogleAppsList() {
        appsGoogleList.click();
    }

    public void selectGoogleMaps() {
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name=app]")));
        googleMapsApp.click();
    }
}
