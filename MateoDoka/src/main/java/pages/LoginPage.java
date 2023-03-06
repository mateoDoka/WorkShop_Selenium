package pages;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver= BasePage.getInstance().driver;

    public LoginPage( ) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css ="input[id='Email']")
    public WebElement email;

    @FindBy(css="input[id='Password']")
    public  WebElement password;
    @FindBy(css="button[class='button-1 login-button']")
    public  WebElement loginBtn;
    @FindBy(css="button[class='button-1 register-button']")
    public WebElement registerBtn;
}
