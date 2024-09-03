package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HomePage {
    public HomePage (){PageFactory.initElements(Driver.getDriver(),this);}


    //---------------Rana Nur---------------\\

    @FindBy(xpath = "//*[@id='navigation']/div[2]/ul[1]/li[2]")
    public WebElement HomePageListingLink;

    @FindBy (xpath = "//*[@class='ipt-title']")
    public WebElement listingPropertiesYazisi;


}
