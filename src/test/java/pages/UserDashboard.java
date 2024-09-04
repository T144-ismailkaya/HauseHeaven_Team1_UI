package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserDashboard {
    public UserDashboard(){ PageFactory.initElements(Driver.getDriver(),this);}

    //---------------İsmail Kaya---------------\\

    //-------------İsmail Kaya Son--------------\\

    //---------------Levent Seflek---------------\\

    @FindBy (xpath = "//*[@class='listing-locate']")
    public List<WebElement> sefUsersearchedList;

    //---------------Levent Seflek Son------------\\

    //---------------Dilek---------------\\

    //---------------Dilek Son---------------\\

    //---------------Mustafa İsmail--------------\\

    @FindBy (xpath = "//div[@class=\"col-lg-4 col-md-6 col-sm-12\"]")
    public WebElement agentsPageAllAgentsList;

    @FindBy (xpath = "//div[@class=\"fr-grid-footer\"]")
    public WebElement agentsPropertiesTextsList;

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
