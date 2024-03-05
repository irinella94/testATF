package stepDefinition;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import util.DataKey;
import util.ScenarioContext;

import javax.xml.crypto.Data;

import static actions.Actions.isDisplayed;
import static util.ScenarioContext.saveData;


public class LogginSteps extends AbstractStep {
    private ChromeDriver driver;

    @When("User navigates to the website homepage")
    public void user_navigates_to_the_website_homepage() {
        System.setProperty("webdriver.chrome.driver", "src\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        if (driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img")).isDisplayed())
            log.info("Parabank logo este");
        if (driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2")).isDisplayed())
            log.info("Customer login este");
    }

    @When("User clicks on 'Login' button")
    public void user_clicks_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).isDisplayed())
            log.info("Please enter a username and password.");
        Thread.sleep(1000);
        //driver.quit();
    }

    @When("User clicks on 'Register' button")
    public void user_clicks_on_register_button() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']")).isDisplayed())
            log.info("Signing up este.");
        if (driver.findElement(By.xpath("//input[@id='customer.username']")).isDisplayed())
            log.info("Username este.");
        if (driver.findElement(By.xpath("//input[@id='customer.password']")).isDisplayed())
            log.info("Password este.");
        if (driver.findElement(By.xpath("//input[@id='repeatedPassword']")).isDisplayed())
            log.info("Confirm este.");
        Thread.sleep(1000);
        //  driver.close();
        //   driver.quit();
    }

    @When("User inserts some mandatory fields")
    public void user_inserts_some_mandatory_fields() throws InterruptedException {
        String username="Irina";
        String password = "step";
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Irina");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("step");
        ScenarioContext.saveData(DataKey.USERNAME, username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("step");
        ScenarioContext.saveData(DataKey.PASSWORD, password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("step");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Thread.sleep(4000);


    }

}
