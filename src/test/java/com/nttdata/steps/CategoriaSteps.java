package com.nttdata.steps;

import com.nttdata.page.CategoriaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriaSteps {

    private WebDriver driver;

    //constructor
    public CategoriaSteps(WebDriver driver){
        this.driver = driver;
    }

    public void lblclothes(){
        WebElement lblclothesElement = driver.findElement(CategoriaPage.lblClothes);
        lblclothesElement.click();
    }

    public void lblmen(){
        WebElement lblMenElement = driver.findElement(CategoriaPage.lblMen);
        lblMenElement.click();
    }





}
