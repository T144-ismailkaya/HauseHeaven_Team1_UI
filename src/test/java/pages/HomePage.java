package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


    //Levent---------/

    @FindBy (xpath = "//*[@id=\"frmhomesearch\"]/div[2]/button")
    public WebElement  sefUserBodysearchButtonElementi;

    @FindBy (xpath = "//*[@class=\"form-control\"]")
    public WebElement sefUserSearhforloactionboxElementi;

    @FindBy (xpath = "//*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement sefUsercookies;



    @FindBy (id = "minprice")
    public WebElement sefSearchBoxMinPriceDDM;

    @FindBy (id = "maxprice")
    public WebElement sefSearchBoxMaxPriceDDM;

    @FindBy (id = "ptypes")
    public WebElement sefSearchBoxPropertyTypeDDM;

    @FindBy (id = "select-bedroom")
    public WebElement sefSearchBoxBedroomTypeDDM;

    @FindBy (className = "py-5")
    public WebElement SefFooterElementi;

    @FindBy (xpath = "//*[@class='footer-widget']")
    public List<WebElement> sefFooterGenelList;

    @FindBy (className = "img-footer")
    public  WebElement sefFooterLogo;

    @FindBy (className = "col-lg-3 col-md-4")
    public  WebElement seffooterAddresselementi;










    //Levent-------

}
