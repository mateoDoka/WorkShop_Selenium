package pages;

import driver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.google.common.base.Predicates.contains;

public class RegisterPage {
    WebDriver driver= BasePage.getInstance().driver;

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="input[id='gender-male']")
     public  WebElement radioGender;

    @FindBy(css="input[id='FirstName']")
    public WebElement username;
    @FindBy(css ="input[id='LastName']")
    public WebElement lastname;
    @FindBy(css="input[id='Email']")
    public WebElement email;
    @FindBy(css="input[id='Company']")
    public  WebElement companyname;
    @FindBy(css ="input[id='Password']")
    public  WebElement password;
    @FindBy(css ="input[id='ConfirmPassword']")
    public  WebElement confirmPassword;

    @FindBy(css="button[id='register-button']")
    public WebElement registerbtn;



}
