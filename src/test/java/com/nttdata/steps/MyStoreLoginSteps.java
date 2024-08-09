package com.nttdata.steps;

import com.nttdata.page.MyStoretLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStoreLoginSteps {

    private WebDriver driver;

    public MyStoreLoginSteps (WebDriver driver){
        this.driver = driver;
    }

    public void typeUsuario(String user) {

        WebElement usuarioInputElement = driver.findElement(MyStoretLoginPage.txtcorreo);
        usuarioInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStoretLoginPage.btnIniciarSesion));

    }

    public void typeClave (String clave){
        this.driver.findElement(MyStoretLoginPage.txtPassword).sendKeys(clave);
    }

    public void clickLogin(){
        this.driver.findElement(MyStoretLoginPage.btnLogin).click();
    }

    public void IniciarSesion(){
        this.driver.findElement(MyStoretLoginPage.btnIniciarSesion).click();
    }


}
