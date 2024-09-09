package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDashboard {

    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // [Hause Heaven Admin] - [Login fonksiyonu] Bölümünün elementleri

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordAdminTextbox;

    @FindBy(className = "signin")
    public WebElement signInButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement settingsSayfaDogrulama;

    //---------------İsmail Kaya---------------\\
    @FindBy(xpath = "//*[normalize-space(text())='Real Estate']")
    public WebElement realEstateButonu;

    @FindBy(id = "cms-plugins-property")
    public WebElement propertiesButonu;

    @FindBy(id = "cms-plugins-project")
    public WebElement projectsButonu;

    @FindBy(id = "cms-plugins-re-feature")
    public WebElement featuresButonu;

    @FindBy(id = "cms-plugins-facility")
    public WebElement facilitiesButonu;

    @FindBy(id = "cms-plugins-investor")
    public WebElement investorsButonu;

    @FindBy(id = "cms-plugins-real-estate-category")
    public WebElement categoriesButonu;

    @FindBy(id = "cms-plugins-real-estate-type")
    public WebElement typesButonu;

    @FindBy(id = "cms-real-estate-review")
    public WebElement reviewsButonu;

    @FindBy(id = "cms-plugins-real-estate-settings")
    public WebElement settingsButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement sayfaDogrulama;

    //-------------İsmail Kaya Son--------------\\

    //---------------Levent Seflek---------------\\

    @FindBy (xpath = "test01")
    public WebElement  seftestelementbuttonuElementi;

    @FindBy (xpath = "(//*[@class='nav-link nav-toggle'])[3]")
    public WebElement sefadminsideDashBlogButtonElementi;

    @FindBy (xpath = "(//*[@class='sub-menu  hidden-ul '])[1]")
    public List<WebElement> sefadminsideDashBlogList;

    @FindBy (xpath = "//*[@class='username d-none d-sm-inline']")
    public WebElement sefadminHeaderUserNameButtonu;

    @FindBy (xpath = "//*[@class='btn-logout']")
    public WebElement sefadminHeaderLogoutButtonu;


    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement sefadminLogoutConfirmMsgelementi;

    @FindBy (id = "cms-plugins-blog-post")
    public WebElement sefSidenNavPostselementi;

    @FindBy (xpath = "//*[@class=' text-start column-key-name']")
    public List<WebElement> sefadminPostPageList;

    @FindBy (xpath = "//*[@class='page-sidebar-menu page-header-fixed '] ")
    public WebElement sefadminSidedDashElementi;

    @FindBy (id = "cms-plugins-blog-tags")
    public WebElement sefAdminTagButton;

    @FindBy (id= "cms-plugins-location")
    public WebElement sefadminLocationButtonElementi;

    @FindBy (id= "cms-plugins-country")
    public WebElement sefadminCountiresButtonElementi;

    @FindBy (xpath = "//*[@class=' text-start column-key-name']")
    public List<WebElement> sefadminCountiresUlkeList;

    @FindBy (xpath = "//*[@class='btn btn-secondary action-item']")
    public WebElement sefadminCountiresCreateButtonElementi;

    @FindBy (xpath = "//span[normalize-space()='Reload']")
    public WebElement sefadminCountiresReloadButtonElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[1]")
    public WebElement sefadminCountiresNameBoxElementi;

    @FindBy (xpath = "(//*[@class='form-control'])[2]")
    public WebElement sefadminCountiresNationalityElementi;

    @FindBy (xpath = "//*[@id=\"code\"]")
    public WebElement sefadminCountiresISOBoxElementi;

    @FindBy (xpath = "//*[@id='dial_code']" )
    public WebElement sefadminCountiresDialCodeBoxElementi;

    @FindBy (xpath = "//*[@id='order']")
    public WebElement sefadminCountiresOrderBoxElementi;

    @FindBy (xpath = "//*[@id='select2-status-container']")
    public WebElement sefadminCountiresStatusBoxElementi;

    @FindBy(xpath = "//select[@class='form-control select-full ui-select select2-hidden-accessible']")
    public WebElement sefadminCountiresPublishedselectElementi;

    @FindBy(xpath = "(//*[@class='btn btn-success'])[1]")
    public WebElement sefadminCountiresSaveElementi;

    @FindBy(xpath = "//*[@id=\"botble-location-forms-country-form\"]/div[2]/div[2]/div[1]/div[2]/div/button[1]")
    public WebElement sefadminCountiresSaveExitElementi;

    @FindBy(xpath = "//*[@data-bs-original-title='Edit']")
    public WebElement sefadminCountiresEditButtonElementi;

    @FindBy (xpath = "//input[@placeholder='Search...']")
    public WebElement sefadminSearchboxElementi;

    @FindBy (xpath = "//div[@class='toast-message']")
    public WebElement sefadminCreateEditPageKayyitMSGElementi;

    @FindBy (xpath = "//tr[@class='even']//a[@role='button']")
    public WebElement sefadminDeleteButton;

    @FindBy (xpath = "//*[@id=\"main\"]/div[2]/div/div/div[3]/button[2]")
    public WebElement sefadminDeleteConfirmMsg;











    //---------------Levent Seflek Son------------\\

    //---------------Dilek---------------\\

    //---------------Dilek Son---------------\\

    //---------------Mustafa İsmail--------------\\

    //---------------Mustafa İsmail Son---------------\\

    //---------------Rana Nur---------------\\

    @FindBy (xpath = "(//*[@class='title'])[7]")
    public WebElement adminNewsletter;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[1]")
    public WebElement adminSearch;

    @FindBy (xpath = "(//*[@class='d-none d-sm-inline'])[1]")
    public WebElement showFromYazisi;

    @FindBy (xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement adminDashboardNewsletterDeleteButonu;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement newsletterDeleteConfirmButonu;

    @FindBy(xpath = "//*[@class='toast-message']")
    public WebElement deleteSuccesfullyMessage;

    @FindBy (xpath = "//*[@class='fa fa-download']")
    public WebElement exportButonu;

    @FindBy (xpath = "//*[@class='dt-button dropdown-item buttons-csv']")
    public WebElement CSVFormatIndirme;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[2]")
    public WebElement mesajlariSiralamaButonu;

    @FindBy (xpath = "//*[@class='far fa-envelope']")
    public WebElement adminContactLink;

    @FindBy (xpath = "//*[@class='breadcrumb-item active']")
    public WebElement adminContactYazisiDogrulama;

    @FindBy (xpath = "(//*[@class='form-control input-sm'])[1]")
    public WebElement adminContactSeacrhKutusu;

    @FindBy (xpath = "//*[@class='dataTables_empty']")
    public WebElement adminContactNoRecordYazisi;

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement adminContactSayfasiDeleteButonu;

    @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement adminContactSayfasiConfirmDeleteButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement adminContactDeletedSuccessfullyYazisi;

    @FindBy (xpath = "(//*[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement adminContactEditButonu;

    @FindBy (xpath = "(//*[@class='breadcrumb-item active'])[1]")
    public WebElement adminContactEditViewContactYazisi;

    @FindBy (xpath = "//*[@id='status']")
    public WebElement contactEditPageStatusDDM;

    @FindBy (xpath = "//*[@class='btn btn-info']")
    public WebElement contactSayfasiEditSaveExitButonu;

    @FindBy (xpath = "//*[@class='toast-message']")
    public WebElement contactSayfasiUpdatedSuccessfullyYazisi;

    @FindBy (xpath = "//*[@class='fa fa-download']")
    public WebElement adminContactExport;

    @FindBy (xpath = "//*[@class='fas fa-file-csv']")
    public WebElement adminContactCSV;

    @FindBy (xpath = "//*[@name='botble-contact-tables-contact-table_length']")
    public WebElement contactSayfasiMesajSIralama10lu;


    //---------------Rana Nur Son---------------\\

    //---------------Bünyamin---------------\\

    //---------------Bünyamin Son---------------\\

    //---------------Fatma (FDM)---------------\\

    //---------------Fatma (FDM) Son---------------\\

    //---------------Mehmet Muavviz---------------\\

    //---------------Mehmet Muavviz Son---------------\\

    //---------------Merve Nur---------------\\

    //---------------Merve Nur Son---------------\\

}
