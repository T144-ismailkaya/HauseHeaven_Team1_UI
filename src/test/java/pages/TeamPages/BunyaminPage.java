package pages.TeamPages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BunyaminPage {

    public BunyaminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
