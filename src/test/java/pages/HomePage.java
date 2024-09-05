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

    @FindBy (xpath = "col-lg-3 col-md-4")
    public  WebElement seffooterAddresselementi;

    //Levent Son-------/

    //Dilek------------/

    //Dilek Son--------/

    //Mustafa İsmail---/

    @FindBy (xpath = "//*[@class=\"img-fluid mx-auto\"]")
    public WebElement agentsPhotoElementList;

    @FindBy (xpath = "//div/ul/li/strong[text()=\"Phone:\"]")
    public WebElement agentsPhoneNumberTextsList;

    @FindBy (xpath = "//div/ul/li/strong[text()=\"Email:\"]")
    public WebElement agentsEmailTextsList;

    @FindBy (xpath = "//*[@class=\"ipt-title\"]")
    public WebElement agentDetailTitle;

    @FindBy (xpath = "//*[@class=\"prt-view\"]")
    public List <WebElement> agentViewButonuList;

    //Mustafa İsmail Son/

    //Rana Nur---------/

    @FindBy(xpath = "//*[@id='navigation']/div[2]/ul[1]/li[2]")
    public WebElement HomePageListingLink;

    @FindBy (xpath = "//*[@class='ipt-title']")
    public WebElement listingPropertiesYazisi;

    @FindBy (xpath = "//*[@class=\"m-0\"]")
    public WebElement listingResultsYazisi;

    @FindBy (xpath = "(//*[@class='page-link'])[4]")
    public WebElement listingPageDigerSayfayaGecmeButonu;

    @FindBy (xpath = "(//*[@class='prt-link-detail'])[5]")
    public WebElement listingUcuncuSayfaIlanYaziElementi;

    @FindBy (xpath = "(//*[@class='listing-card-info-price'])[1]")
    public WebElement listingUcuncuSayfaFiyatElementi;

    @FindBy(xpath = "(//*[@class=\"listing-img-wrapper\"])[1]")
    public WebElement listingUcuncuSayfaFotografElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement listingSayfasiSearchForALocationKutusu;

    @FindBy (xpath ="//*[@id='select2-city_id-container']" )
    public WebElement listingSayfasiCityDDM;

    @FindBy (xpath = "//*[@class='select2-search__field']")
    public WebElement listingSayfasiCitySearch;

    @FindBy (xpath = "//*[@id='select2-city_id-results']")
    public WebElement listingSayfasiCitySearchResult;


    //Rana Nur Son-----/

    //Bünyamin---------/

    //Bünyamin Son-----/

    //Fatma (FDM)------/

    @FindBy (xpath = "//*[@class='image-cover hero-banner']")
    public WebElement buyukResim;

    @FindBy (xpath = "//*[@class='hero-search']")
    public WebElement FindAccessibleHomesToRentFormu;

    @FindBy (xpath = "//div[@class='input-with-icon']")
    public WebElement formSearchForALocation;

    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[1]")
    public WebElement formMinPrice;

    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[2]")
    public WebElement formMaxPrice;

    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[3]")
    public WebElement formPropertyType;

    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[4]")
    public WebElement formBedRooms ;

    @FindBy (xpath = "(//*[@class='select2-selection select2-selection--single'])[5]")
    public WebElement formPropertyLocation;

    @FindBy (xpath = "//button[normalize-space()='Search Result']")
    public WebElement formSearchResult;

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
