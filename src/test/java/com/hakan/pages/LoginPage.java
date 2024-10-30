package com.hakan.pages;



import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        setupUsers();
    }

    @FindBy(xpath = "//input[@placeholder='Username or Email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(css = "input.login-btn")
    public WebElement loginButton;




    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }


    // A Map to store user credentials
    Map<String, String[]> users = new HashMap<>();

    private void setupUsers(){
        users.put("helpdesk", new String[]{"helpdesk5@cydeo.com", "UserUser"});
        users.put("hr", new String[]{"hr4@cydeo.com", "UserUser"});
        users.put("marketing", new String[]{"marketing15@cydeo.com", "UserUser"});

    }

    public void login(String accountType){
        String[] credentials = users.get(accountType);

        if (credentials != null) {
            String username = credentials[0];
            String password = credentials[1];

            this.userName.sendKeys(username);
            this.password.sendKeys(password);
            this.loginButton.click();

        } else {
            System.out.println("Invalid account type: " + accountType);
        }
    }

}
