package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

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

    @FindBy(xpath = "//*[@id=\"frmhomesearch\"]/div[2]/button")
    public WebElement sefUserBodysearchButtonElementi;

    @FindBy(xpath = "//*[@class=\"form-control\"]")
    public WebElement sefUserSearhforloactionboxElementi;

    @FindBy(xpath = "//*[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement sefUsercookies;

    @FindBy(id = "minprice")
    public WebElement sefSearchBoxMinPriceDDM;

    @FindBy(id = "maxprice")
    public WebElement sefSearchBoxMaxPriceDDM;

    @FindBy(id = "ptypes")
    public WebElement sefSearchBoxPropertyTypeDDM;

    @FindBy(id = "select-bedroom")
    public WebElement sefSearchBoxBedroomTypeDDM;

    @FindBy(className = "py-5")
    public WebElement SefFooterElementi;

    @FindBy(xpath = "//*[@class='footer-widget']")
    public List<WebElement> sefFooterGenelList;

    @FindBy(className = "img-footer")
    public WebElement sefFooterLogo;

    @FindBy(xpath = "//*[@class='col-lg-3 col-md-4']")
    public WebElement seffooterAddresselementi;

    @FindBy(xpath = "//*[text()='Terms & Conditions']")
    public WebElement sefFooterTermsandCondtionsElementi;

    @FindBy(xpath = "//*[text()='All properties']")
    public WebElement sefFooterAllPropertiesElementi;

    @FindBy(xpath = "//*[text()='Houses for sale']")
    public WebElement sefFooterHouseForSaleElementi;

    @FindBy(xpath = "//*[text()='Houses for rent']")
    public WebElement sefFooterHouseForRentElementi;

    @FindBy(xpath = "//*[text()='The Benefits Of Investing In Emerging Real Estate Markets']")
    public WebElement sefFooterBenefirInvestingElementi;

    @FindBy(xpath = "//*[text()='A Guide To Negotiating The Best Deal On Your Dream Home']")
    public WebElement sefFooterAGuideToNegoElementi;

    @FindBy(xpath = "//*[text()='The Rise Of Sustainable Homes: Building For A Greener Future']")
    public WebElement sefFooterRiseOfSustainebaleElementi;

    @FindBy(xpath = "//*[text()='How to Stage Your Home for a Quick and Profitable Sale']")
    public WebElement sefFooterHowtoStageElementi;

    @FindBy(xpath = "//*[text()='Investing in Vacation Rental Properties: A Lucrative Opportunity']")
    public WebElement sefFooterInvestingVacationElementi;

    @FindBy(xpath = "//*[text()='Get It Now']")
    public WebElement sefFooterGoogleAPPelementi;

    @FindBy(xpath = "//*[text()='Now it Available']")
    public WebElement sefFooterAppleAPPElementi;

    @FindBy(xpath = "//*[text()='About us']")
    public WebElement sefFooterAboutUsElementi;

    @FindBy(xpath = "//span[normalize-space()='Contact us']")
    public WebElement sefFooterContactUsElmenti;

    @FindBy(xpath = "//*[@placeholder='Enter your email']")
    public WebElement sefFooterSubscribeBox;

    @FindBy(xpath = "(//*[text()='Subscribe'])[2]")
    public WebElement getSefFooterSubscribeBoxButtonElementi;

    @FindBy(xpath = "//i[@class='ti-arrow-up']")
    public WebElement sefFooterUpArrowElementi;

    @FindBy(className = "ipn-subtitle")
    public WebElement sefFooterHeaderTitle;

    @FindBy(xpath = "//*[@title=\"Facebook\"]")
    public WebElement SefFooterFacebookBoxElementi;

    @FindBy(xpath = "//*[@title='Twitter']")
    public WebElement SeftwitterBoxButtonElementi;

    @FindBy(xpath = "//*[@title='Instagram']")
    public WebElement SefFooterInstagramButtonElementi;

    @FindBy(xpath = "//*[@title='Linkedin']")
    public WebElement SefFooterLinkedinButtonElementi;

    @FindBy(xpath = "//*[@title='Pinterest']")
    public WebElement SefFooterPintestButtonElementi;

    @FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
    public WebElement seffooterSubscribeConfirmYaziElementi;


    //Levent Son-------/

    //Dilek------------/

    //Dilek Son--------/

    //Mustafa İsmail---/

    @FindBy(xpath = "//*[@class=\"img-fluid mx-auto\"]")
    public WebElement agentsPhotoElementList;

    @FindBy(xpath = "//div[@class=\"col-lg-4 col-md-6 col-sm-12\"]")
    public WebElement agentsPageAllAgentsList;

    @FindBy(xpath = "//div[@class=\"fr-grid-footer\"]")
    public WebElement agentsPropertiesTextsList;

    @FindBy(xpath = "//div/ul/li/strong[text()=\"Phone:\"]")
    public WebElement agentsPhoneNumberTextsList;

    @FindBy(xpath = "//div/ul/li/strong[text()=\"Email:\"]")
    public WebElement agentsEmailTextsList;

    @FindBy(xpath = "//*[@class=\"ipt-title\"]")
    public WebElement agentDetailTitle;

    @FindBy(xpath = "//*[@class=\"prt-view\"]")
    public List<WebElement> agentViewButonuList;

    @FindBy(xpath = "(//*[@rel=\"nofollow\"])[2]")
    public WebElement logoutButonu;

    @FindBy (xpath = "(//*[@rel=\"nofollow\"])[1]")
    public WebElement accountDashboardButonu;

    @FindBy (xpath = "//*[@title=\"Settings\"]")
    public WebElement accountDashboardSettingsButonu;

    @FindBy (xpath = "//*[@class=\"btn btn-primary fw6\"]")
    public WebElement adSettingsSaveButonu;

    @FindBy (xpath = "//*[@name=\"phone\"]")
    public WebElement adSettingsPhoneTextBox;

    @FindBy (xpath = "//*[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement alert;




    //Mustafa İsmail Son/

    //Rana Nur---------/

    @FindBy(xpath = "//*[@id='navigation']/div[2]/ul[1]/li[2]")
    public WebElement HomePageListingLink;

    @FindBy(xpath = "//*[@class='ipt-title']")
    public WebElement listingPropertiesYazisi;

    @FindBy(xpath = "//*[@class=\"m-0\"]")
    public WebElement listingResultsYazisi;

    @FindBy(xpath = "(//*[@class='page-link'])[4]")
    public WebElement listingPageDigerSayfayaGecmeButonu;

    @FindBy(xpath = "(//*[@class='prt-link-detail'])[5]")
    public WebElement listingUcuncuSayfaIlanYaziElementi;

    @FindBy(xpath = "(//*[@class='listing-card-info-price'])[1]")
    public WebElement listingUcuncuSayfaFiyatElementi;

    @FindBy(xpath = "(//*[@class=\"listing-img-wrapper\"])[1]")
    public WebElement listingUcuncuSayfaFotografElementi;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement listingSayfasiSearchForALocationKutusu;

    @FindBy(xpath = "//*[@id='select2-city_id-container']")
    public WebElement listingSayfasiCityDDM;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement listingSayfasiCitySearch;

    @FindBy(xpath = "//*[@id='select2-city_id-results']")
    public WebElement listingSayfasiCitySearchResult;

    @FindBy (xpath = "(//*[@class='prt-link-detail'])[1]")
    public WebElement listingSayfasiBakuMulku;

    @FindBy (xpath = "//*[@id='select2-sort_by-container']")
    public WebElement listingSayfasiSortButonu;

    @FindBy (xpath = "//*[@id='select2-sort_by-result-2uod-date_asc']")
    public WebElement sortOldest;

    @FindBy (xpath = "//*[@class='select2-search__field']")
    public WebElement sortButonu;

    @FindBy (xpath = "//*[@class='select2-selection__clear']")
    public WebElement sortSiralamaSilme;

    @FindBy (xpath = "//*[@id='sort_by']")
    public WebElement sortSelect;

    @FindBy (xpath = "//*[@class='btn btn btn-theme-light-2 rounded full-width mt-3']")
    public WebElement findNewHomeButonu;

    @FindBy (xpath = "//*[@class='m-0']")
    public WebElement listingde0ResultYazisi;

    @FindBy (xpath = "(//*[@class='page-link'])[3]")
    public WebElement sayfaDegistirmeButonu2;

    @FindBy (xpath = "(//*[@class='page-link'])[4]")
    public WebElement sayfaDegistirmeButonu3;

    @FindBy (xpath = "(//*[@class='page-link'])[5]")
    public WebElement sayfaDegistirmeButonu4;

    @FindBy (xpath = "(//*[@class='page-link'])[6]")
    public WebElement sayfaDegistirmeButonuSagaOk;

    @FindBy (xpath = "(//*[@class='page-link'])[1]")
    public WebElement sayfaDegistirmeButonuSolaOk;

    @FindBy (xpath = "//*[@class='fas fa-user']")
    public WebElement kayitliKullaniciUserLinki;

    @FindBy (xpath = "//*[@class='far fa-edit mr1']")
    public WebElement ilanGirmeWriteaPropertyLinki;

    @FindBy (xpath = "//*[@class='badge badge-info']")
    public WebElement ilanGirmeBuyCreditsKrediBilgisi;

    @FindBy (xpath = "//*[@title='credits']")
    public WebElement ilanGirmeBuyCreditsLinki;

    @FindBy (xpath = "(//*[@class='btn btn-primary mt-2'])[2]")
    public WebElement ilanGirmeBuyCreditSinglePostPurchase;

    @FindBy (xpath = "(//*[@type='text'])[1]")
    public WebElement krediKartiCardNumberKutusu;

    @FindBy (xpath = "(//*[@class='form-control jp-card-invalid'])[1]")
    public WebElement krediKartiAyGunButonu;

    @FindBy (xpath = "(//*[@class='form-control jp-card-invalid'])[2]")
    public WebElement krediKartiAdSoyadButonu;

    @FindBy (xpath = "//*[@id='stripe-cvc']")
    public WebElement krediKartiGuvenlikBilgisiButonu;

    @FindBy (xpath = "//*[@class='payment-checkout-btn btn btn-info']")
    public WebElement krediKartiPurchasebutonu;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement ilanYayinlamaFormuTitleKutusu;

    @FindBy (xpath = "//*[@class='ck-placeholder']")
    public WebElement ilanYayinlamaFormuContentKutusu;

    @FindBy (xpath = "//*[@id='location']")
    public WebElement ilanYayinlamaFormuPropertyLocationKutusu;

    @FindBy (xpath = "//*[@class='btn btn-sm btn-info']")
    public WebElement ilanYayinlamaFormuSaveAndExitButonu;

    @FindBy (xpath = "//*[@id='alert-container']/div")
    public WebElement ilanCreatedSuccesfuly;

    @FindBy (xpath = "//*[@title='Properties']")
    public WebElement kayitlikullaniciPropertiesLinki;

    @FindBy (xpath = "//*[@type='search']")
    public WebElement kayitlikullaniciSearchKutusu;

    @FindBy (xpath = "//*[@class='dataTables_empty']")
    public WebElement noRecordYazisi;

    @FindBy (xpath = "//*[@class='d-none d-sm-inline']")
    public WebElement showFromYazisi;

    @FindBy (xpath = "//*[@class='fas fa-sync']")
    public WebElement reloadButonu;

    @FindBy (xpath = "//*[@class='alert alert-success alert-dismissible']")
    public WebElement newsletterSuccesfullAlert;

    @FindBy (xpath = "//*[@class='alert alert-danger alert-dismissible']")
    public WebElement theEmailHasAlreadyBeenTaken;



















    //Rana Nur Son-----/

    //Bünyamin---------/

    //Bünyamin Son-----/

    //Fatma (FDM)------/

    @FindBy(xpath = "//*[@class='image-cover hero-banner']")
    public WebElement buyukResim;

    @FindBy(xpath = "//*[@class='hero-search']")
    public WebElement FindAccessibleHomesToRentFormu;

    @FindBy (xpath = "//*[@class='form-control']")
    public WebElement formSearchForALocation;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--single'])[1]")
    public WebElement formMinPrice;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--single'])[2]")
    public WebElement formMaxPrice;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--single'])[3]")
    public WebElement formPropertyType;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--single'])[4]")
    public WebElement formBedRooms;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--single'])[5]")
    public WebElement formPropertyLocation;

    @FindBy(xpath = "//button[normalize-space()='Search Result']")
    public WebElement formSearchResult;

    @FindBy (xpath = "//*[@class='m-0']")
    public WebElement ActualSonuc;

    @FindBy (xpath = "")
    public WebElement ExpectedSonuc;

    //Fatma (FDM) Son--/

    //Mehmet Muavviz---/

    @FindBy(xpath = "//*[@class='nav-menus-wrapper']")
    public WebElement HeaderLinki;

    //Mehmet Muavviz Son/

    //Merve Nur--------/

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactnamekutusuElementi;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement contactemailkutusElementi;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactsubjectkutusuElementi;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactphonekutusuElementi;

    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement contactmesajkutusuElementi;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement contactsendmeesagebutonu;

    @FindBy(xpath = "//*[@id=\"ismain-homes\"]/div/div[2]/section/div/div[1]/div/div/h2")
    public WebElement listinglinkisayfası;

    @FindBy(xpath = "//*[@class='blue-skin']")
    public WebElement listingsayfabası;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement listingfindbybutonu;

    @FindBy(xpath = "(//*[@class='icon-actions-wrapper'])[1]")
    public WebElement listingwishlistbutonu;

    @FindBy(xpath = "//*[@id=\"alert-container\"]")
    public WebElement listingwislistaddbutonu;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div")
    public WebElement listingseciliilan;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div[2]/div[1]/div[1]/div[6]/div[1]/a/h4")
    public  WebElement listingilangalery;

    @FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[5]/div/section/div/div/div/div/a")
    public  WebElement  contactsingontoday;

    @FindBy(xpath = "//i[@class='lni-twitter']")
    public WebElement listingsayfasiilantwitterElementi;

    @FindBy(xpath = "//i[@class='lni-linkedin']")
    public WebElement listingsayfasiilanlinkedinElementi;

    @FindBy(xpath = "(//a[normalize-space()='Share'])[1]")
    public WebElement listingshare;

    @FindBy(xpath = "//body//div[@id='main-wrapper']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[1]//a[3]")
    public WebElement listingpuansevice;


    @FindBy(xpath = "//div[@id='clTen']//div[2]//div[1]//div[1]//a[4]")
    public WebElement listingpuanvalue;

    @FindBy(xpath = "//div[3]//div[1]//div[1]//a[5]")
    public  WebElement listingpuanlocation;

    @FindBy(xpath = "//div[@id='app']//div[4]//div[1]//div[1]//a[3]")
    public WebElement listingpuancleanlines;


    @FindBy(xpath = "textarea[placeholder='Messages']")
    public WebElement listingmesajkutusuElementi;

    @FindBy(xpath = "(//button[normalize-space()='Submit Review'])[1]") //*[@class='btn btn-theme-light-2 rounded']
    public WebElement listingmesajkutususubmitbutonu; //"//*[@id=\"clTen\"]/div/form/div[2]/div[2]/div/button"

    @FindBy(xpath = "//span[@class='title']")
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

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement listingconsultsphonekutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement listingconsultsemailkutusu;

    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement listingconsultsmesajkutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement listingconsultssendmessagebutonu;

    @FindBy(xpath = "//div[@id='alert-container']")
    public WebElement listingmesajuyarıelemnti;

    @FindBy(xpath = "//div[@id='alert-container']")
    public WebElement listingmesajgonderildielemnti;

    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement singupbutonu;

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

    @FindBy(xpath = "//*[@id=\"contact\"]/div[1]/form/div[4]/div[2]")
    public WebElement contactmessageerror;

    @FindBy(xpath = "//*[@id=\"app\"]/section/div/div[2]/div/div/div/h3")
    public WebElement contactdırections;

    @FindBy(xpath = "//*[@class='ti-home']")
    public WebElement contactreachuselementi;

    @FindBy(xpath = "//*[text()='Use ctrl + scroll to zoom the map']")
    public WebElement contactharitagoruntule;
    @FindBy (xpath = "//*[@id=\"app\"]/section/div/div[2]/div/div/div/div[2]/div/iframe")
    public WebElement contcatiframe;

    @FindBy(id = "//*[@id='first_name']")
    public WebElement singupfirsname;

    @FindBy(id = "//*[@id='last_name']")
    public WebElement singuplastname;

    @FindBy(id = "//*[@id='username']")
    public  WebElement singuousername;

    @FindBy (id = "//*[@id='password-confirm']")
    public WebElement singupconfirmpassword;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singupregister;


    //Merve Nur Son----/

}
