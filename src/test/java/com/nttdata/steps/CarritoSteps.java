package com.nttdata.steps;

import com.nttdata.page.CarritoPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarritoSteps {

    private WebDriver driver;
    private int clickCount = 0;

    //constructor
    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }

    public void btnImg(){
        WebElement btnImgElement = driver.findElement(CarritoPage.btnImagen);
        btnImgElement.click();
    }

    public void CantidadCarrito(int cantidad){
        WebElement cantidadelement = driver.findElement(CarritoPage.btnCantidad);
        for (int i = 0; i < cantidad -1; i++) {
            cantidadelement.click();
            clickCount++;
        }
    }

    public void AgregarCarrito(){
        WebElement AgregarCarritoElement = driver.findElement(CarritoPage.btnAnadirCarrito);
        AgregarCarritoElement.click();
    }

    public void validarPopup(){
        WebElement lblPopup = driver.findElement(CarritoPage.lblPopup);
        System.out.println(lblPopup.getText());
    }

    public void validarMontoTotal(){
        WebElement validarMontoTotalElement = driver.findElement(CarritoPage.lblMontototal);
        validarMontoTotalElement.click();
    }

    public void FinalizarCompra(){
        WebElement FinalizarCompraElement = driver.findElement(CarritoPage.btnFinalizarCompra);
        FinalizarCompraElement.click();
    }

    public void validarTituloCarrito(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CarritoPage.lblCarrito));
        WebElement lblCarritoElement = driver.findElement(CarritoPage.lblCarrito);
        System.out.println(lblCarritoElement.getText());
        Assert.assertEquals(lblCarritoElement.getText(), "CARRITO");
    }

    public void validarMontoTotalFinal(){
        WebElement validarMontoTotalFinalElement = driver.findElement(CarritoPage.lblMontototalfinal);
        validarMontoTotalFinalElement.click();
    }


}
