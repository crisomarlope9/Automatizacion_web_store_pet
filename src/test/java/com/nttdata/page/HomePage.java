package com.nttdata.page;

import org.openqa.selenium.By;

public class HomePage {
    public static By categorias = By.xpath("//*[@id=\"category-3\"]/a");
    public static By subcaterias = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    public static By producto = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By cantidad = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By agregar = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    public static By confirmacion = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[1]");
    public static By finalizarCompra= By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    public static By precio_final=By.xpath(("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]"));
    public static By titleCarrito =By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");
    public static By sumaCarrito=By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");
    public static By paginaPrincipal= By.xpath("//*[@id=\"content\"]/section[1]/h2");
}