package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginStorePage {
    public static By btonLogin= By.id("_desktop_user_info");
    public static By userInput = By.xpath("//*[@id=\"field-email\"]");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
}
