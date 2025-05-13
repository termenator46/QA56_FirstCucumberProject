package com.ilcarro.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Path;

public class Letthecarwork extends Basepage {

    public Letthecarwork(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//a[@ng-reflect-router-link='let-car-work']")
    WebElement Link_let_car_work;

    public Letthecarwork Link_let_car_work() {
        pause(500);
        Link_let_car_work.click();
        return this;


    }

    @FindBy(id = "make")
    WebElement Manufactureinput;
    @FindBy(css = "#pickUpPlace")
    WebElement Locationinput;
    @FindBy(id = "model")
    WebElement Modelinput;
    @FindBy(id = "year")
    WebElement yearinput;
    @FindBy(css = "#fuel")
    WebElement fuelinput;
    @FindBy(id = "seats")
    WebElement seatsinput;
    @FindBy(id = "class")
    WebElement classinput;
    @FindBy(id = "serialNumber")
    WebElement serialNumberinput;
    @FindBy(id = "price")
    WebElement priceinput;
    @FindBy(css = ".positive-button.ng-star-inserted")
    WebElement okButton;

    public Letthecarwork EnterData(String Price, String registerNumber, String car_Clas, String Seats, String year, String location, String facture, String model) {
        Locationinput.sendKeys(location);
        pause(1000);
       Locationinput.sendKeys(Keys.DOWN);
        Locationinput.sendKeys(Keys.ENTER);
        type(Manufactureinput, facture);
        type(Modelinput, model);
        type(yearinput, year);
        fuelinput.sendKeys(Keys.DOWN, Keys.ENTER);
        type(seatsinput, Seats);
        type(classinput, car_Clas);
        type(serialNumberinput, registerNumber);
        type(priceinput, Price);
        click(Sumbbit);

        return this;

    }

    @FindBy(xpath = "(//h1[@class='title'])[2]")
    WebElement Car_add;
    public Letthecarwork verife_is_Car_add(String text) {
        pause(500);
        assert isContainsText(text, Car_add);
        return this;
    }

    public Letthecarwork EnterData2(String text) {
            new Select(fuelinput).selectByVisibleText(text);

        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement Sumbbit;
    public Letthecarwork SumbitRecfest() {
        scrollWithJs(0,400);
        click(Sumbbit);
        return this;
    }



    public Letthecarwork clikcOnOk() {
        click(okButton);
        return this;
    }
}

