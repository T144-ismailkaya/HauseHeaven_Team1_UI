package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage{

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // [Hause Heaven] - [Header] Bölümünün elementleri. \\

    @FindBy(xpath = "//*[normalize-space(text())='Home']")
    public WebElement homeButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Listing']")
    public WebElement listingButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Projects']")
    public WebElement projectsButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Agents']")
    public WebElement agentsButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Blog']")
    public WebElement blogButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Contact']")
    public WebElement contactButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Sign Up']")
    public WebElement signupButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Add Property']")
    public WebElement addPropertyButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Sign In']")
    public WebElement signinButonu;

    // [Hause Heaven] - [Sign In] - [Login fonksiyonu] Bölümünün elementleri. \\

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "(//*[normalize-space(text())='Login'])[3]")
    public WebElement loginButonu;

}
