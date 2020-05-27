package pagesMail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginInput extends DriverPage {

    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement clickEnter;


    protected void setInputLogin(String login) {
        inputLogin.sendKeys(login);
    }

    protected void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    protected void setClickEnter() {
        clickEnter.click();
    }
}




