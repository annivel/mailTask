package messageMail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesMail.DriverPage;

public class MakeMassage extends DriverPage {

    @FindBy(xpath = "//p[@class='make_message']/child::a")
    private WebElement clickMakeMess;


    public void setClickMakeMess() {
        clickMakeMess.click();
    }
}
