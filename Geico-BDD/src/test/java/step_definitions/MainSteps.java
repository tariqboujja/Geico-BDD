package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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


    // @CBCF-3
    @And("I click  button {string}")
    public void iClickButton(String Menu) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, Menu))));

    }

    // @CBCF-3
    @Then("I click a button {string}")
    public void iClickAButton(String Insurance) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT, Insurance))));

    }

    // @CBCF-3
    @Then("Verify {string} are displayed")
    public void verifyAreDisplayed(String InsuranceOptions) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, InsuranceOptions))));


    }

    // @CBCF-7
    @Then("I click the button {string}")
    public void iClickTheButton(String AdditionalInsurance) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT, AdditionalInsurance))));
    }

    @Then("I click {string}")
    public void iClick(String AdditionalInsuranceLinks) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS2, AdditionalInsuranceLinks))));
    }


    @Then("Verify {string}")
    public void verify(String Url) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), Url);

    }
    // @CBCF-9
    @Then("I open the {string} page")
    public void iOpenThePage(String Information) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2, Information))));
    }



    @Then("Verify Contact Us is displayed")
    public void verifyContactUsIsDisplayed() {

        WebElement btn = page.contactUs;
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].displayed;", btn);
    }

}

