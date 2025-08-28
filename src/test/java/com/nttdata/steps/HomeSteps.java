package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteps {
    private WebDriver driver;

    //contrsuctor
    public HomeSteps(WebDriver driver){
        this.driver = driver;
    }



    public void categoria(String cat) {

        Assert.assertEquals("SE INGRESO INCORRECTAMTE LA CATEGORIA",cat,this.driver.findElement(HomePage.categorias).getText());
        this.driver.findElement(HomePage.categorias).click();
    }
    public void subcategoria(String sub) {
        Assert.assertEquals("SE INGRESO INCORRECTAMTE LA SUBCATEGORIA",sub,this.driver.findElement(HomePage.subcaterias).getText());
        this.driver.findElement(HomePage.subcaterias).click();

    }

    public void ingresarProducto() {
        this.driver.findElement(HomePage.producto).click();
    }

    public void agregarCantidad() {
        this.driver.findElement(HomePage.cantidad).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

    }

    public void agregarCarrito() {
        this.driver.findElement(HomePage.agregar).click();


    }

    public void validarProducto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement modal = wait.until(
                ExpectedConditions.visibilityOfElementLocated(HomePage.confirmacion));
        Assert.assertEquals(
                "El producto no se agregó correctamente",
                "Hay 2 artículos en su carrito.",
                modal.getText()
        );

    }

    public void validarSuma() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        WebElement precioFinal = wait.until(
                ExpectedConditions.visibilityOfElementLocated(HomePage.precio_final));
        Assert.assertEquals(
                "La suma no se hizo correctamente",
                "S/ 38.24",
                precioFinal.getText()
        );

    }

    public void finalizarCompra() {
        this.driver.findElement(HomePage.finalizarCompra).click();
    }

    public void validarTituloCarrito() {

        Assert.assertEquals(
                "El titulo de la carrito no se hizo correctamente",
                "CARRITO",
                this.driver.findElement(HomePage.titleCarrito).getText()
        );

    }

    public void ultimaValidacionSuma() {
        Assert.assertEquals(
                "No se sumo correctamente el carrito",
                "S/ 38.24",
                this.driver.findElement(HomePage.sumaCarrito).getText()
        );
    }
}
