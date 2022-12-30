package org.Selenium.google;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.Selenium.google.page.ConsentGooglePage;
import org.Selenium.google.page.GoogleMapsPage;
import org.Selenium.google.page.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GooglePageObjectSteps {
    private WebDriver driver;

    @Given("I'm on google.com page")
    public void openGoogleMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.com");

        MainPage mainPage = new MainPage(driver);
        mainPage.acceptCookie();
    }

    @Then("I select google map")
    public void openGoogleMaps() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openGoogleAppsList();
        mainPage.selectGoogleMaps();
        ConsentGooglePage consentGooglePage = new ConsentGooglePage(driver);
        consentGooglePage.acceptCookieBtn();
    }

    @Then("I find address (.+)")
    public void iFindAddress(String address) {
        GoogleMapsPage googleMapsPage = new GoogleMapsPage(driver);
        googleMapsPage.searchInput(address);

    }
}
