package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @When("the user clicks on {string} button")
    public void theUserClicksOnButton(String menu) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, menu))));
    }

    @Then("verify Menu {string} are displayed")
    public void verifyMenuAreDisplayed(String menuLinks) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, menuLinks))));

    }

    @And("the user clicks on {string} link")
    public void theUserClicksOnLink(String insuranceButton) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, insuranceButton))));

    }

    @Then("verify {string} are displayed")
    public void verifyAreDisplayed(String businessInsuranceLinks) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, businessInsuranceLinks))));
    }

    //  @CBCF-16
    @Then("verify Types of Web and Mobile Services are displayed")
    public void verify_types_of_web_and_mobile_services_are_displayed(String webAndMobileLinks) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT2, webAndMobileLinks))));
    }

    //  @CBCF-16
    @Then("verify {string}")
    public void verify(String currentUrl) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), currentUrl);
    }

    //  @CBCF-17
    @When("the user clicks on {string}")
    public void theUserClicksOn(String espanolButton) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.linkText("Español")));
        //(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, espanolButton))));
    }

    //  @CBCF-17
    @Then("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String title) {
        title = "Una Compañía de Seguros para Tu Auto y Más | GEICO";
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @When("the user click on {string} drop down menu")
    public void theUserClickOnDropDownMenu(String dropDownMenu) {
//        BrowserUtils.click(BrowserUtils.getDriver().findElement(
//                By.xpath("/html//select[@id='manage_select']")));
        Select menuItem = new Select(BrowserUtils.getDriver().findElement
                (By.xpath("/html//select[@id='manage_select']")));
        menuItem.selectByVisibleText("Auto");
        menuItem.selectByVisibleText("Motorcycle");
    }

    @Then("verify {string}> is displayed")
    public void verifyIsDisplayed(String policies) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, policies))));
    }
}