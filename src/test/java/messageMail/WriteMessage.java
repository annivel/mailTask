package messageMail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesMail.DriverPage;

public class WriteMessage extends DriverPage {
    @FindBy(xpath = "//textarea[@tabindex='2']")
    private WebElement inputAdress;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement inputTheme;
    @FindBy(xpath = "//textarea[@tabindex='10']")
    private WebElement writeText;

    @FindBy(xpath = "//p[@class='send_container']/input[@name='send']")
    private WebElement send;

    @FindBy(xpath = "//ul[@class= 'list_line']//descendant::a[2]")
    private WebElement switchToAllMessage;



    public void setInputAdress(String adress) {
        inputAdress.sendKeys(adress);
    }

    public void setInputTheme(String theme) {
        inputTheme.sendKeys(theme);
    }

    public void setWriteText(String text) {
        writeText.sendKeys(text);

    }

    public void setSend() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(send));
        send.click();
    }

    public void setSwitchToAllMessage() {
        switchToAllMessage.click();
    }


}
