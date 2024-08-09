package com.nttdata.page;

import org.openqa.selenium.By;

public class CarritoPage {

    public static By btnImagen = By.xpath("//*[@id='js-product-list']/div[1]/div/article/div/div[1]/a");
    public static By btnCantidad = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[1]/div/span[3]/button[1]/i");
    public static By btnAnadirCarrito = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button");
    public static By lblPopup = By.xpath("//*[@id='myModalLabel']");
    public static By lblMontototal = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By btnFinalizarCompra = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a");
    public static By lblCarrito = By.xpath("//*[@id='main']/div/div[1]/div/div[1]/h1");
    public static By lblMontototalfinal= By.xpath("//*[@id='main']/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[2]/span/strong");

}
