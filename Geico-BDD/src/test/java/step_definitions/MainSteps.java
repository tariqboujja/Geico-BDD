package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @Then("verify the title of that page {string}")
    public void verifyTheTitleOfThatPage(String arg0) {
    }

    //  @CBCF-15
    @When("user clicks on {string} button")
    public void userClicksOnButton(String menu) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, menu))));
    }

    @Then("user clicks on {string} link")
    public void userClicksOnLink(String information) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, information))));
    }

    @When("user clicks  {string}")
    public void userClicks(String contactUs) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT2_CONTAINS, contactUs))));
    }

    @Then("verify {string}")
    public void verify(String currentUrl) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), currentUrl);
    }

    //  @CBCF-16
    @Then("verify Types of Web and Mobile Services are displayed")
    public void verify_types_of_web_and_mobile_services_are_displayed(String webAndMobileLinks) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT2, webAndMobileLinks))));
    }

    //  @CBCF-17
    @When("the user clicks on {string}")
    public void theUserClicksOn(String espanolButton) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.linkText("Español")));
        //(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, espanolButton))));
    }

    @Then("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String title) {
        title = "Una Compañía de Seguros para Tu Auto y Más | GEICO";
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    // @CBCF-19
    @Then("the user click on {string} drop down menu")
    public void theUserClickOnDropDownMenu(String arg0) {
        WebElement btn = BrowserUtils.getDriver().findElement
                (By.xpath("/html//select[@id='manage_select']"));
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].click();", btn);
    }

    @And("verify {string} is displayed")
    public void verifyIsDisplayed(String policies) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, policies))));
    }

    // @CBCF-20
    @Then("I click a {string} button")
    public void iClickAButton(String loginBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, loginBtn))));
    }

    @Then("a user clicks on {string} link")
    public void aUserClicksOnLink(String activateAccountBtn) {
        WebElement btn = BrowserUtils.getDriver().findElement
                (By.cssSelector("div#manage_ecams_form > ul > li:nth-of-type(1) > a"));
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].click();", btn);
    }

    @And("verify  title of the page {string}")
    public void verifyTitleOfThePage(String activateAccountPageTitle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), activateAccountPageTitle);

    }

    // @CBCF-22
    @Then("user clicks on {string}")
    public void userClicksOn(String arg0) {
        WebElement btn = BrowserUtils.getDriver().findElement(By.xpath
                ("/html//nav[@id='primary-navigation']/div[2]//div[@class='claims']/ul//a[@href='https://geico.app.link/static/claims']"));
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].click();", btn);
    }

    @And("verifies the title of the page {string}")
    public void verifiesTheTitleOfThePage(String reportAccidentPageTitle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), reportAccidentPageTitle);
    }

    // @CBCF-23
    @Then("I click on {string} link")
    public void iClickOnLink(String trackClaim) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, trackClaim))));
    }

    @And("user verify the title of the page {string}")
    public void userVerifyTheTitleOfThePage(String trackClaimTitle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), trackClaimTitle);
    }

    // @CBCF-25
    @Then("I click  {string}")
    public void iClick(String requestRoadsideAssistanceBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, requestRoadsideAssistanceBtn))));

    }

    @And("I verify the title of the page {string}")
    public void iVerifyTheTitleOfThePage(String roadsideAssistanceTitle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), roadsideAssistanceTitle);
    }

    // @CBCF-29
    @Then("I click  {string} button")
    public void iClickButton(String feedbackBtn) {
        WebElement btn = BrowserUtils.getDriver().findElement(By.xpath
                ("/html//button[@id='QSIFeedbackButton-btn']"));
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].click();", btn);
    }

    @And("verify page title {string}")
    public void verifyPageTitle(String feedbackTitle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), feedbackTitle);
    }
}

