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

    public MainSteps() {
        page = new MainPage();

    }

    @Given("I open url of mainpage")
    public void iOpenUrlOfMainpage() {
        BrowserUtils.getDriver();
    }

    // @CBCF-5
    @Then("verify Title of the Main Page {string}")
    public void verifyTitleOfTheMainPage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    // @CBCF-5
    @When("I click on the {string} button")
    public void iClickOnTheButton(String menu) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, menu))));
    }

    // @CBCF-5
    @And("I click  the {string} button")
    public void iClickTheButton(String insurance) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, insurance))));
    }

    // @CBCF-5
    @Then("I click {string} button")
    public void iClickButton(String propertyInsurance) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, propertyInsurance))));
    }

    // @CBCF-5
    @Then("I click the links on the Insurance {string}")
    public void iClickTheLinksOnTheInsurance(String links) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS2, links))));
        System.out.println(BrowserUtils.getDriver().getTitle());
    }

    // @CBCF-5
    @And("verify current url {string}")
    public void verifyCurrentUrl(String currentUrl) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), currentUrl);
    }

    // @CBCF-4
    @Then("I click  on {string} button")
    public void iClickOnButton(String vehicleInsurance) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, vehicleInsurance))));
    }

    // @CBCF-4
    @Then("I click on the links on the Insurance {string}")
    public void iClickOnTheLinksOnTheInsurance(String links) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS2, links))));

    }

    // @CBCF-8
    @Then("I click Insurance links buttons")
    public void iClickInsuranceLinksButtons() {
        page.clickOnInsuranceLink();

    }

    @Then("I should click the {string} link button")
    public void iShouldClickTheLinkButton(String Information) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, Information))));
    }

    @Then("I click the {string} link button")
    public void iClickTheLinkButton(String aboutGeico) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, aboutGeico))));
    }


    @And("verify ann click {string} under Information")
    public void verifyAnnClickUnderInformation(String links) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, links))));
    }


    @Then("I click  {string} link button")
    public void iClickLinkButton(String toolsAndResources) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, toolsAndResources))));
    }


    @And("Verify the links are displayed")
    public void verifyTheLinksAreDisplayed() {
        page.toolsAndResources();
    }

    @Then("I verify the {string} is displayed")
    public void iVerifyTheIsDisplayed(String search) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, search))));
    }

    @And("I verify a {string} is displayed")
    public void iVerifyAIsDisplayed(String searchBox) {
        BrowserUtils.isDisplayed(page.searchBox);
    }

    @When("I enter {string} in the search box")
    public void iEnterInTheSearchBox(String info) {

        page.searchBox();
    }

    @Then("I click on the {string} button and verify the current url")
    public void iClickOnTheButtonAndVerifyTheCurrentUrl(String searchBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, searchBtn))));
        System.out.println(BrowserUtils.getDriver().getCurrentUrl());
    }

    @When("I verify the {string} button is displayed")
    public void iVerifyTheButtonIsDisplayed(String login) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, login))));

    }


    @Then("I click a {string} button")
    public void iClickAButton(String loginBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, loginBtn))));
    }

    @And("options {string}, {string}, and {string} should be displayed")
    public void optionsAndShouldBeDisplayed(String policyAccess, String claimCenter, String location) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, policyAccess))));
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, claimCenter))));
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, location))));
    }

    @And("click  on {string} button")
    public void clickOnButton(String glassDamageOnly) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, glassDamageOnly))));
    }

    @Then("it should navigate to the Report Claim page and verify title of the page {string}")
    public void itShouldNavigateToTheReportClaimPageAndVerifyTitleOfThePage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @And("verify the Report a Claim form is displayed")
    public void verifyTheReportAClaimFormIsDisplayed() {
        BrowserUtils.isDisplayed(page.glassDamageForm);
    }

    @And("Verify the {string} sign is displayed")
    public void verifyTheSignIsDisplayed(String location) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, location))));
    }

    @And("Verify the location box is displayed")
    public void verifyTheLocationBoxIsDisplayed() {
        BrowserUtils.isDisplayed(page.zipCodeBox);
    }
    @Then("I type a zip code in the location box")
    public void iTypeAZipCodeInTheLocationBox() {
        BrowserUtils.sendKeys(page.zipCodeBox, "32822");
    }
    @And("click on the {string} button")
    public void clickOnTheButton(String updateBtn) {
        BrowserUtils.isEnabled(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, updateBtn))));
        WebElement btn = BrowserUtils.getDriver().findElement(By.xpath("//*[text()='Update']"));
        JavascriptExecutor j = (JavascriptExecutor) BrowserUtils.getDriver();
        j.executeScript("arguments[0].click();", btn);
    }
    @Then("Verify the the new zip code is displayed")
    public void verifyTheTheNewZipCodeIsDisplayed() {
        BrowserUtils.isDisplayed(page.newZipCode);
        System.out.println(page.newZipCode.getText());
    }

    @Then("I verify {string} is displayed")
    public void iVerifyIsDisplayed(String topSerches) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, topSerches))));
    }


    @Then("I click on the {string} link")
    public void iClickOnTheLink(String links) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2, links))));
    }

    @And("verify title of the page {string}")
    public void verifyTitleOfThePage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("it should navigate to the Web & Mobile page and verify title {string}")
    public void itShouldNavigateToTheWebMobilePageAndVerifyTitle(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @And("click  on {string} btn")
    public void clickOnBtn(String btn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn))));
    }



    @And("Verify the Change location button is displayed")
    public void verifyTheChangeLocationButtonIsDisplayed() {
        BrowserUtils.isDisplayed(page.changeLocation);
    }

    @Then("I click on the Change location button")
    public void iClickOnTheChangeLocationButton() {
        BrowserUtils.click(page.changeLocation);
    }


    @Then("I click btn")
    public void iClickBtn() {
        BrowserUtils.click(page.closeLoginWindowBtn);
    }

    @And("I click the button to change the screen mode")
    public void iClickTheButtonToChangeTheScreenMode() {
        BrowserUtils.click(page.darkModeSwitchButton);

    }

    @Then("I verify the screen mode is changed")
    public void iVerifyTheScreenModeIsChanged() {
        BrowserUtils.isDisplayed(page.darkModeSwitch);
    }
}




















