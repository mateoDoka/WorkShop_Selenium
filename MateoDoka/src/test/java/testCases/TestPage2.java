package testCases;

import cucumber.api.java.nl.Stel;
import driver.BasePage;
import gherkin.lexer.Gl;
import global.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.HomePageSteps;
import steps.LoginSteps;
public class TestPage2 {
    WebDriver driver= BasePage.getInstance().driver;
    LoginSteps loginSteps= new LoginSteps();
    HomePageSteps homePageSteps= new HomePageSteps();
    TestPage testPage= new TestPage();

    public  TestPage2(){
        PageFactory.initElements(driver,this);
    }
    @BeforeTest
    public void init()  {
        driver.get(GlobalVariables.baseUrl);

    }
    @Test
            public void test() throws InterruptedException {
        testPage.test();
        homePageSteps.ClickLogIn();
        String email= TestPage.email;
        loginSteps.setEmail(email);
        loginSteps.setPassword(GlobalVariables.password);
        loginSteps.clickLogIn();
         homePageSteps.welcomeText();


    }
@AfterTest
    public void afterTest(){
    homePageSteps.logoutText();
    homePageSteps.logOut();

}

}
