package pages;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver= BasePage.getInstance().driver;

    public HomePage( ) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className ="ico-login")
    public WebElement loginBtnHomePage;

    @FindBy(xpath = "//div[@class='topic-block-title']//h2[contains(.,'Welcome to our store')]")
    public WebElement welcomeText;

    @FindBy(className ="ico-logout")
    public WebElement logoutMenu;


}
