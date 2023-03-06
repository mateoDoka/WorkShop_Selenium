
package steps;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;


public class HomePageSteps {
    HomePage homePage= new HomePage();
    WebDriver driver= BasePage.getInstance().driver;

    public HomePageSteps(){
        PageFactory.initElements(driver,this);
    }
    public void ClickLogIn(){
        homePage.loginBtnHomePage.click();
    }
    public void welcomeText(){
        String text= homePage.welcomeText.getText();
        assert text.equalsIgnoreCase("Welcome to our store") : "Log in was not successful";
    }
    public void logoutText(){
        String txt=homePage.logoutMenu.getText(); {
            assert  txt.equalsIgnoreCase("Log out") : "Log out is not displayed";
        }
    }
public  void logOut(){
        homePage.logoutMenu.click();
}

}
