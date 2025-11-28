package org.rv.pom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.rv.utils.ConfigReader;

public class LoginPage extends PageObject {

    String usernameField = "[name='username']";
    String passwordField = "[name='password']";
    String loginButton = "//button[contains(text(),'Login')]";
    String baseUrl = new ConfigReader().getBaseUrl();
    public void visitApp(){
        openUrl(baseUrl);
    }
    public WebElementFacade getUserNameField(){
        return find(usernameField).waitUntilVisible();
    }
    public WebElementFacade getPasswordField(){
        return find(passwordField).waitUntilVisible();
    }
    public WebElementFacade getloginButton(){
        return find(loginButton).waitUntilClickable();
    }

    public void enterUserName(String username){
        getUserNameField().type(username);
    }
    public void enterPassword(String password){
        getPasswordField().type(password);
    }
    public void clickOnloginButton(){
        getloginButton().click();
    }

}
