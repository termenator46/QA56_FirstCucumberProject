package com.ilcarro.pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends Basepage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email")
    WebElement emailinput;
    @FindBy(id = "password")
    WebElement passwordinput;
    public LoginPage enterData(String email, String password) {
        type(emailinput,email);
        type(passwordinput,password);
        return this;
    }
    @FindBy(css = "[type='submit']")
    WebElement yalaButten;

    public LoginPage clickOnYallaButton() {
        click(yalaButten);
        return this;
    }
    @FindBy(css = "h2.message")
     WebElement message;
    public LoginPage verifyMessage(String text) {
        pause(500);
        assert  isContainsText(text,message);
        return this;
    }


    public LoginPage enterWrongData(DataTable table) {
        List<Map<String,String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterData(email,password);
        return this;
    }
}
