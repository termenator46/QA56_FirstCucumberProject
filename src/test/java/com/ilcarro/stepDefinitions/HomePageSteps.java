package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.Basepage.driver;

public class HomePageSteps {

    HomePage home;
    @Given("User launches Chrome browser")
    public void launch_Chrome_browser(){
        home = new HomePage(driver);
        home.launchBrowser();
    }
    @When("User opens ilcarro HomePage")
    public void  open_HomePage(){
        home.openURL();

    }
    @Then("User verify HomePage title is displayed")
    public void verify_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("user Quites browser")
    public void uites_browser(){
        new HomePage(driver).quiteBrowser();
    }
}
