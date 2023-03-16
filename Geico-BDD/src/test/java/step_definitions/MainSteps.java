package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import pages.MainPage;
import utils.BrowserUtils;

public class MainSteps implements CommonPage {
    MainPage page;
    WebDriver driver;


    public MainSteps() {
        page = new MainPage();

    }
    @Given("I open url of mainpage")
    public void iOpenUrlOfMainpage() {
        BrowserUtils.getDriver();
    }

    @Then("verify Title of the Main Page {string}")
    public void verifyTitleOfTheMainPage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(),title );
    }
}