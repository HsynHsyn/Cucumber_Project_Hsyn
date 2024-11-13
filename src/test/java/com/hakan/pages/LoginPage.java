package com.hakan.pages;

import com.hakan.utilities.ConfigurationReader;
import com.hakan.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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


    @FindBy(css = "input.login-btn")
    public WebElement bulletPoint;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }


    // A Map to store user credentials
    Map<String, String[]> users = new HashMap<>();

    private void setupUsers(){
        users.put("helpdesk", new String[]{ConfigurationReader.getProperty("helpdesk_username"),
                                           ConfigurationReader.getProperty("helpdesk_password")});


        users.put("hr", new String[]{ConfigurationReader.getProperty("hr_username"),
                                     ConfigurationReader.getProperty("hr_password")});

        users.put("marketing", new String[]{ConfigurationReader.getProperty("marketing_username"),
                                            ConfigurationReader.getProperty("marketing_password")});

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
//-----------------------------------login2--------------------------------------------------------------------
    //second login method approach
    public void login2(String userType){
        String userName = "";
        String password = "";

        switch (userType.toLowerCase()) {
            case "hr":
                userName = ConfigurationReader.getProperty("hr_username");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "helpdesk":
                userName = ConfigurationReader.getProperty("helpdesk_username");
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "marketing":
                userName = ConfigurationReader.getProperty("marketing_username");
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.loginButton.click();
    }
//-----------------------------------------------------------------------------------------




}
