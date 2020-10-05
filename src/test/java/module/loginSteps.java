package module;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps {

    WebDriver driver;

    @Given("I navigate to betway site {string}")
    public void i_navigate_to_betway_site(String Url) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
    }

    @Given("I enter mobilenumber {string} and password {string}")
    public void i_enter_mobilenumber_and_password(String mobileNumber, String password) {
        try{

        }catch(ElementNotVisibleException e){
            System.out.print(e.toString());

        }
        driver.findElement(new By.ById("MobileNumber")).sendKeys(mobileNumber);
        driver.findElement(new By.ById("Password")).sendKeys(password);
    }

    @Given("I click on login button")
    public void i_click_on_login_button() {
       driver. findElement(new By.ById("Login")).click();
    }

    @Then("i should see Deposit {string}, freebet {string}, My Account {string} and logout {string}")
    public void i_should_see_deposit_freebet_my_account_and_logout(String string, String string2, String string3, String string4) {

    }

    @Then("close browser")
    public void close_browser() {
    driver.quit();
    }


}
