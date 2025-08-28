package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeSteps;
import com.nttdata.steps.LoginStoreSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStoreStepsDef {
    private WebDriver driver;
    @Given("estoy en la pagina de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe");
        screenShot();
    }

    @And("me logue con mi usuario {string} y clave {string}")
    public void meLogueConMiUsuarioYClave(String user, String password) {
        LoginStoreSteps loginStoreSteps = new LoginStoreSteps(driver);
        loginStoreSteps.btnlogin();
        loginStoreSteps.typeUser(user);
        loginStoreSteps.typePassword(password);
        loginStoreSteps.login();

    }

    @When("nevego en a la categoria {string} y la subcategoria {string}")
    public void nevegoEnALaCategoriaYLaSubcategoria(String cat, String sub){
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.categoria(cat);
        homeSteps.subcategoria(sub);
        screenShot();
         }

    @And("agrego dos unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.ingresarProducto();
        homeSteps.agregarCantidad();
        homeSteps.agregarCarrito();
        screenShot();
    }

    @Then("valido que el popup la confirmacion del producto agregado")
    public void validoQueElPopupLaConfirmacionDelProductoAgregado() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.validarProducto();
        screenShot();

    }

    @And("valido que el pupup que el monto total sea calculado correctamente")
    public void validoQueElPupupQueElMontoTotalSeaCalculadoCorrectamente() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.validarSuma();
        screenShot();

    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.finalizarCompra();
        screenShot();
    }

    @Then("valido que el titulo de la pagina del carrito")
    public void validoQueElTituloDeLaPaginaDelCarrito() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.validarTituloCarrito();
        screenShot();
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.ultimaValidacionSuma();
        screenShot();
    }
}
