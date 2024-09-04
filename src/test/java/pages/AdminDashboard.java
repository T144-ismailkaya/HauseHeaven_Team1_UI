package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "//*[normalize-space(text())='Properties']")
    public WebElement propertiesButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Projects']")
    public WebElement projectsButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Features']")
    public WebElement featuresButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Facilities']")
    public WebElement facilitiesButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Investors']")
    public WebElement investorsButonu;

    @FindBy(xpath = "(//*[normalize-space(text())='Categories'])[2]")
    public WebElement categoriesButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Types']")
    public WebElement typesButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Reviews']")
    public WebElement reviewsButonu;

    @FindBy(xpath = "//*[normalize-space(text())='Settings']")
    public WebElement settingsButonu;

    @FindBy(xpath = "(//*[@class='breadcrumb-item active'])[2]")
    public WebElement sayfaDogrulama;

    //-------------İsmail Kaya Son--------------\\

    //---------------Levent Seflek---------------\\

    @FindBy (xpath = "test01")
    public WebElement  seftestelementbuttonuElementi;

    //---------------Levent Seflek Son------------\\

    //---------------Dilek---------------\\

    //---------------Dilek Son---------------\\

    //---------------Mustafa İsmail--------------\\

    //---------------Mustafa İsmail Son---------------\\

    //---------------Rana Nur---------------\\

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
