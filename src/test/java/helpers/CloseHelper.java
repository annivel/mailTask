package helpers;

import pagesMail.DriverPage;

public class CloseHelper extends DriverPage {
    public void appStop(){
        driver.quit();
    }
}
