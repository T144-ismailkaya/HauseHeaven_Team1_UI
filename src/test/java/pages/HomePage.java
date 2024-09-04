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


    //Levent---------/

    @FindBy (xpath = "//*[@id=\"frmhomesearch\"]/div[2]/button")
    public WebElement  sefUserBodysearchButtonElementi;

    @FindBy (xpath = "//*[@class=\"form-control\"]")
    public WebElement sefUserSearhforloactionboxElementi;

    @FindBy (xpath = "//*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement sefUsercookies;

    @FindBy (xpath = "test")
    public WebElement aaaelementi;
    //Levent-------























































































































































































































    // mervenur --------------
    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactnamekutusuElementi;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public  WebElement contactemailkutusElementi;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactsubjectkutusuElementi;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactphonekutusuElementi;

    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement contactmesajkutusuElementi;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement contactsendmeesagebutonu;

    @FindBy(xpath = "//i[@class='lni-facebook']")
    public WebElement listingsayfasiilanfacebookElementi;

    @FindBy(xpath = "//i[@class='lni-twitter']")
    public WebElement listingsayfasiilantwitterElementi;

    @FindBy(xpath = "//i[@class='lni-linkedin']")
    public WebElement listingsayfasiilanlinkedinElementi;

    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement listingmesajkutusuElementi;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement listingmesajkutususubmitbutonu;

    @FindBy (xpath ="//span[@class='title']")
    public WebElement admintestimonialselementi;

    @FindBy(xpath = "(//button[@value='apply'])[1]")
    public WebElement admintestimonialssavebutonu;

    @FindBy(xpath = "(//button[@value='save'])[1]")
    public WebElement admintestimonialssaveexitbutonu;

    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement admintestimonialscreatebutonu;

    @FindBy(xpath = "//button[@data-result='content']")
    public WebElement admintestimonialscreateshowhidebutonu;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement admintestimonialscreatenamekutusu;

    @FindBy(xpath = "//input[@placeholder='Position/Company']")
    public WebElement admintestimonialscreatepositionkutusu;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement admintestimonialscreatemesajkutusu;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement listingconsultsnamekutusu;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement listingconsultsphonekutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement listingconsultsemailkutusu;

    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement listingconsultsmesajkutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement listingconsultssendmessagebutonu;

    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement adminloginemailkutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminloginpasswordkutusu;

    @FindBy(xpath = "//span[@class='signin']")
    public WebElement adminloginsigninbutonu;

}
