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

    //İsmail---------/

    //İsmail Son-----/

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

    @FindBy (xpath = "//*[@class='col-lg-3 col-md-4']")
    public  WebElement seffooterAddresselementi;

    @FindBy (xpath = "//*[text()='Terms & Conditions']")
    public  WebElement sefFooterTermsandCondtionsElementi;

    @FindBy (xpath = "//*[text()='All properties']")
    public  WebElement sefFooterAllPropertiesElementi;

    @FindBy (xpath = "//*[text()='Houses for sale']")
    public  WebElement sefFooterHouseForSaleElementi;

    @FindBy (xpath = "//*[text()='Houses for rent']")
    public  WebElement sefFooterHouseForRentElementi;

    @FindBy (xpath = "//*[text()='The Benefits Of Investing In Emerging Real Estate Markets']")
    public  WebElement sefFooterBenefirInvestingElementi;

    @FindBy (xpath = "//*[text()='A Guide To Negotiating The Best Deal On Your Dream Home']")
    public  WebElement sefFooterAGuideToNegoElementi;

    @FindBy (xpath = "//*[text()='The Rise Of Sustainable Homes: Building For A Greener Future']")
    public  WebElement sefFooterRiseOfSustainebaleElementi;

    @FindBy (xpath = "//*[text()='How to Stage Your Home for a Quick and Profitable Sale']")
    public  WebElement sefFooterHowtoStageElementi;

    @FindBy (xpath = "//*[text()='Investing in Vacation Rental Properties: A Lucrative Opportunity']")
    public  WebElement sefFooterInvestingVacationElementi;

    @FindBy (xpath = "//*[text()='Get It Now']")
    public  WebElement sefFooterGoogleAPPelementi;

    @FindBy (xpath = "//*[text()='Now it Available']")
    public  WebElement sefFooterAppleAPPElementi;

    @FindBy (xpath = "//*[text()='About us']")
    public  WebElement sefFooterAboutUsElementi;

    @FindBy (xpath = "//span[normalize-space()='Contact us']" )
    public WebElement sefFooterContactUsElmenti;

    @FindBy (xpath = "//*[@placeholder='Enter your email']")
    public  WebElement sefFooterSubscribeBox;

    @FindBy (xpath = "(//*[text()='Subscribe'])[2]")
    public  WebElement getSefFooterSubscribeBoxButtonElementi;

    @FindBy (xpath = "//i[@class='ti-arrow-up']")
    public  WebElement sefFooterUpArrowElementi;

    @FindBy (className = "ipn-subtitle")
    public WebElement sefFooterHeaderTitle;

    @FindBy (xpath = "//*[@title=\"Facebook\"]")
    public  WebElement getSefFooterFacebookBoxElementi;

    @FindBy (xpath = "//*[@title='Twitter']")
    public  WebElement getSefTwitterBoxButtonElementi;

    @FindBy (xpath = "//*[@title='Instagram']")
    public  WebElement getSefFooterInstagramButtonElementi;

    @FindBy (xpath = "//*[@title='Linkedin']")
    public  WebElement getSefFooterLinkedinButtonElementi;

    @FindBy (xpath = "//*[@title='Pinterest']")
    public  WebElement getSefFooterPintestButtonElementi;




    //Levent Son-------/

    //Dilek------------/

    //Dilek Son--------/

    //Mustafa İsmail---/

    //Mustafa İsmail Son/

    //Rana Nur---------/

    //Rana Nur Son-----/

    //Bünyamin---------/

    //Bünyamin Son-----/

    //Fatma (FDM)------/

    //Fatma (FDM) Son--/

    //Mehmet Muavviz---/

    @FindBy (xpath = "//*[@class='nav-menus-wrapper']")
    public WebElement HeaderLinki;

    //Mehmet Muavviz Son/

    //Merve Nur--------/

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

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[6]/a")
    public WebElement contactlinkibutonu;

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[1]/a/img")
    public WebElement hauseheavenlogo;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[2]/div/h2")
    public WebElement contactgetıntuchelementı;

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[4]/div[1]")
    public WebElement contactmessagesuccessfully;

    //Merve Nur Son----/

}
