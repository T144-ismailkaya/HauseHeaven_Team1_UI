package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //---------------İsmail Kaya---------------\\
    @FindBy (xpath = "test02")
    public WebElement  testelementbuttonuElementi;
    //---------------Levent Seflek---------------\\
    @FindBy (xpath = "test01")
    public WebElement  seftestelementbuttonuElementi;
    //---------------Merve Nur---------------\\

    //---------------Rana Nur---------------\\

    //---------------Mehmet Muavviz---------------\\

    //---------------Bünyamin Sait---------------\\

    //---------------Mustafa İsmail---------------\\

    //---------------Dilek ---------------\\

    //---------------Fatma demir---------------\\

    //---------------Sarkan Adiguzelov---------------\\



}
