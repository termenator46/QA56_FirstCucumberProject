package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[1]")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementVisible(homePageTitle);
        return this;

    }

    @FindBy(xpath = "//a[@ng-reflect-router-link='login']")
    WebElement LoginLink;

    public Letthecarwork clickOnLoginLink() {
        click(LoginLink);
        return new Letthecarwork(driver);
    }


    }

