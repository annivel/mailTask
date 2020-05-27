package confirm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesMail.DriverPage;

public class ConfirmMail extends DriverPage {

	@FindBy(xpath = "//div[@class='row new'][1]//span[@class='tm']")
	private WebElement newMailTime;

	@FindBy(xpath="//div[@class='to']//div[@class='field_value']  ")
	private WebElement confirmEmail;



	public void setNewMail(){
	    newMailTime.click();
    }


    public 	String setConfirmEmail(){
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(confirmEmail));
		 return confirmEmail.getText();
	}


}
