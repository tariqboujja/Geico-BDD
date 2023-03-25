package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(className = "nav-menu")
    public WebElement menuLinks;

    @FindBy(linkText = "Insurance")
    public WebElement insuranceLink;

    @FindBy(css = "[data-nav-items='insurance'] li:nth-of-type(3) h3")
    public WebElement businessInsurance;

    @FindBy(css = ".open > .accordion-content-container")
    public WebElement businessInsuranceLinks;

    @FindBy(css = "[data-nav-items] [aria-hidden='false']")
    public WebElement webAndMobileLinks;

    @FindBy(linkText = "Español")
    public WebElement espanolButton;
}
