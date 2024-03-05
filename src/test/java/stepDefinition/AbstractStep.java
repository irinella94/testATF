package stepDefinition;


import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ParabankHomePage;
import pages.ParabankLogin;
import pages.Register;
import util.PropertyLoader;

import java.util.logging.Logger;

public class AbstractStep {
    protected static RemoteWebDriver driverManager;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static JavascriptException executor;
    protected static String chromeDriver = PropertyLoader.loadProperty("chromeDriver");
    protected static String homePageUrl = PropertyLoader.loadProperty("homePageUrl");
    protected ChromeOptions options = new ChromeOptions();

    protected Logger log = Logger.getLogger((this.getClass().getName()));
    protected ParabankHomePage parabankHomePage = new ParabankHomePage(driver);
    protected ParabankLogin parabankLogin = new ParabankLogin(driver);
    protected Register register = new Register(driver);



}
