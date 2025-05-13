package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.Basepage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void clicks_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enter correct data")
    public void enter_correct_data() {
        new LoginPage(driver).enterData("qohydydyje@mailinator.com", "03130313Mr@");
    }

    @And("User click on Yala button")
    public void click_on_Yala_button() {
        new LoginPage(driver).clickOnYallaButton();

    }

    @Then("User verifes Success message is displayed")
    public void verifes_Success_message() {
        new LoginPage(driver).verifyMessage("Logged in success");
    }
    @And("User enter correct email and wrong password")
    public void enter_correct_email_and_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);
    }
    @Then("User verifies Error is displayed")
    public void verifies_Error_is_displayed(){
        new LoginPage(driver).verifyMessage("Login or Password incorrect");
    }

    }



