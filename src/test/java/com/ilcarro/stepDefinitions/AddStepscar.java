package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.Letthecarwork;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.Basepage.driver;

public class AddStepscar {
    @And("User Click Link_let_car_work")
    public void Click_Link_let_car_work(){
        new Letthecarwork(driver).Link_let_car_work();
    }


    @And("User enter infoData")
    public void Test1() {
        new Letthecarwork(driver).EnterData("Haifa, Israel","Luminus","Audi","1993","Gas","4","Deluxe","48217","250");

    }

    @And("User click Submit button")
    public void clickSumbitButten() {
        new Letthecarwork(driver).SumbitRecfest();
    }

    @Then("User verifes Success message")
    public void Test3() {
        new LoginPage(driver).verifyMessage("added successful");


    }
    @And("user click on OK")
    public void click_on_OK(){
        new Letthecarwork(driver).clikcOnOk();
    }

}





