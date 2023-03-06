package steps;

import driver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.RegisterPage;

import java.util.Objects;

public class RegisterPageSteps {

    WebDriver driver= BasePage.getInstance().driver;
     RegisterPage registerPage= new RegisterPage();

    public RegisterPageSteps(){
        PageFactory.initElements(driver,this);
    }
    public void genderRadioBTn(){
        registerPage.radioGender.click();
    }
    public void userName(String username){
        registerPage.username.sendKeys(username);
    }
    public void lastName(String lastName){
        registerPage.lastname.sendKeys(lastName);
    }
    public void emailRegister(String email){
        registerPage.email.sendKeys(email);
    }
    public void companyName(String companyName){
        registerPage.companyname.sendKeys(companyName);
    }
    public  void passwordRegister(String pass){
        registerPage.password.sendKeys(pass);
    }
    public  void confirmPassword(String pass){
        registerPage.confirmPassword.sendKeys(pass);
    }

    public void selector(){
        Select daySelector=new Select(driver.findElement(By.name("DateOfBirthDay")));
        daySelector.selectByIndex(4);
        Select monthSelector= new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthSelector.selectByVisibleText("March");
        Select yearSelector= new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearSelector.selectByValue("2002");
    }
    public void registerBtn(){
        registerPage.registerbtn.click();
    }

    public void registerText(){
     String txt1 =driver.findElement(By.className("result")).getText();
     assert  txt1.equalsIgnoreCase("Your registration completed"): "The text does not show";

    }


}
