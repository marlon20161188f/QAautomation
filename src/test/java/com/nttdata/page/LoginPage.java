package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By iniciarsesionButton = By.xpath("//span[text()=\"Iniciar sesión\"]");
    public static By ClothesButton= By.xpath("//header/div/div/div/div/div/ul/li/a[@href=\"https://qalab.bensg.com/store/es/3-clothes\"]");
    public static By MenButton= By.xpath("//a[text()=\"Men\"]");
    public static By producto= By.xpath("//img[@data-full-size-image-url]");
    public static By agregarcarrito= By.xpath("//button[@data-button-action]");
    public static By confirmarproducto= By.xpath("//a[contains(text(),\"Finalizar compra\")]");

}
