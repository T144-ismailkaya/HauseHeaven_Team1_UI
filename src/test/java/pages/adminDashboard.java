package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminDashboard {

    public adminDashboard (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "test")
    public WebElement testlelemti01;
    @FindBy (xpath = "test")
    public WebElement testlelemti02;
    @FindBy (xpath = "test")
    public WebElement testlelemti03;
    @FindBy (xpath = "test")
    public WebElement testlelemti04;
    @FindBy (xpath = "test")
    public WebElement testlelemti05;
    @FindBy (xpath = "test")
    public WebElement testlelemti06;
    @FindBy (xpath = "test")
    public WebElement testlelemti07;
    @FindBy (xpath = "test")
    public WebElement testlelemti08;
    @FindBy (xpath = "test")
    public WebElement testlelemti09;
    @FindBy (xpath = "test")
    public WebElement testlelemti10;

}
