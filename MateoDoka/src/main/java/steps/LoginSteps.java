package steps;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage= new LoginPage()    ;
    WebDriver driver= BasePage.getInstance().driver;

    public LoginSteps(){
        PageFactory.initElements(driver,this);

    }
    public  void setEmail(String email){
        loginPage.email.sendKeys(email);
    }
    public  void setPassword(String password){
        loginPage.password.sendKeys(password);
    }
    public  void clickLogIn(){
        loginPage.loginBtn.click();
    }

    public void registerBTn(){
        loginPage.registerBtn.click();
    }


}
