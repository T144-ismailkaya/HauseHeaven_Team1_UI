package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserDashboard {
    public UserDashboard(){ PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy (xpath = "//*[@class='listing-locate']")
        public List<WebElement> sefUsersearchedList;

}
