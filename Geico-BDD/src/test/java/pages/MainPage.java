package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//a[@href='/contact-us/'][@data-link-name='primary-navigation:Contact Us']")
    public WebElement contactUs;


    @FindBy(xpath = "//nav[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li")
    public List<WebElement> InsuranceLinks;
    @FindBy(xpath = "//a[text()='Back']")
    public WebElement backBtn;
    @FindBy(xpath = "//*[text()='Insurance']")
    public WebElement insurance;
    @FindBy(xpath = "//nav[1]/div[3]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[2]/div[1]/ul[1]/li")
    public List<WebElement> ToolsAndResources;


    public void clickOnInsuranceLink() {
        for (WebElement link : InsuranceLinks) {
            BrowserUtils.click(link);
            BrowserUtils.click(backBtn);
            BrowserUtils.getDriver().getCurrentUrl();
            BrowserUtils.click(insurance);
        }
    }

    public void toolsAndResources() {
        for (WebElement tool : ToolsAndResources) {
            BrowserUtils.isDisplayed(tool);
        }
    }

    @FindBy(xpath = "//input[@type='text'][@name='term'][@placeholder='Search geico.com']")
    public WebElement searchBox;

    public void searchBox() {
        BrowserUtils.sendKeys(searchBox, "Auto Insurance");
    }
    @FindBy(xpath = "//div[@class='container marginTop20']")
    public WebElement glassDamageForm;
    @FindBy(xpath = "//input[@class='user-zip']")
    public WebElement zipCodeBox;
    @FindBy(xpath = "//span[@class='geo-info']")
    public WebElement newZipCode;

    @FindBy(css = "div#user-location > .change-location")
    public WebElement changeLocation;

    @FindBy(xpath = "//nav[@id='primary-navigation']//button[@class='btn-close icon-close']")
    public WebElement closeLoginWindowBtn;

    @FindBy(css="#darkModeSwitch")
    public WebElement darkModeSwitch;
    @FindBy(css=".button-switch")
    public WebElement darkModeSwitchButton;



}