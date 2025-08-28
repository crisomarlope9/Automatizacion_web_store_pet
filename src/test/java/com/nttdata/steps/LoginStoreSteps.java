package com.nttdata.steps;

import com.nttdata.page.HomePage;
import com.nttdata.page.LoginStorePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.screenShot;
import static java.lang.Thread.sleep;

public class LoginStoreSteps {
    private WebDriver driver;

    //constructor
    public LoginStoreSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginStorePage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginStorePage.loginButton));


    }
    public void typePassword(String password){
        this.driver.findElement(LoginStorePage.passInput).sendKeys(password);
    }

    public void login(){
        this.driver.findElement(LoginStorePage.loginButton).click();
        screenShot();
        Assert.assertEquals("Credenciales incorrectamente","PRODUCTOS DESTACADOS",this.driver.findElement(HomePage.paginaPrincipal).getText());
    }

    public void btnlogin() {
        this.driver.findElement(LoginStorePage.btonLogin).click();
    }
}
