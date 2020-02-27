package Cucumber.DefinitionSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class LoginStackOverflow {

    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\lchoi\\Desktop\\Leo's Cucumber\\src\\test\\resources\\WebDrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
        this.driver = null;
    }

    @Given("User navigates to stackoverflow website")
    public void userNavigatesToStackoverflowWebsite() {
        driver.get("https://stackoverflow.com");
    }

    @And("User clicks on the login button on homepage")
    public void userClicksOnTheLoginButtonOnHomepage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Log In']")).click();
    }

    @And("User enters a valid username")
    public void userEntersAValidUsername() {
    }

    @And("Users enters a valid password")
    public void usersEntersAValidPassword() {
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
    }

    @Then("User should be taken to the succesfull login page")
    public void userShouldBeTakenToTheSuccesfullLoginPage() {
    }
}
