package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import com.nttdata.steps.CategoriaSteps;
import com.nttdata.steps.MyStoreLoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MyStoreLoginSetpDef {

    private WebDriver driver;

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/es/");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {

        MyStoreLoginSteps myStoreLoginSteps = new MyStoreLoginSteps(driver);
        myStoreLoginSteps.clickLogin();
        myStoreLoginSteps.typeUsuario(usuario);
        myStoreLoginSteps.typeClave(clave);
        myStoreLoginSteps.IniciarSesion();
        screenShot();
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String clothes, String men) {
        CategoriaSteps categoriaSteps = new CategoriaSteps(driver);
        categoriaSteps.lblclothes();
        categoriaSteps.lblmen();
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cantidad) {

        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.btnImg();
        carritoSteps.CantidadCarrito(cantidad);
        carritoSteps.AgregarCarrito();
        screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.validarPopup();
        screenShot();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.validarMontoTotal();
        screenShot();
    }

    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.FinalizarCompra();
        screenShot();
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDel() {
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.validarTituloCarrito();
        screenShot();


    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        CarritoSteps carritoSteps = new CarritoSteps(driver);
        carritoSteps.validarMontoTotalFinal();
        screenShot();
    }
}
