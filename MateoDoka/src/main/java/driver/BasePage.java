package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static  String webdriverKey="webdriver.chrome.driver";
    public static  String webdriverPath="src/main/resources/chromedriver.exe";

    public  static BasePage instances= null;
    public  static WebDriver driver= null;

    public BasePage(){
        initElements();

    }

    public  static BasePage getInstance(){
        if(instances==null){
            instances= new BasePage() ;

        }
        return instances;
    }

    private void initElements() {
        System.setProperty(webdriverKey,webdriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

}
