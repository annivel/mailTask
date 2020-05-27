package helpers;

import confirm.ConfirmMail;

public class ConfirmMailHelper extends ConfirmMail {
    public void clickNewMailTime(){
        setNewMail();
    }
    public String takeAdress(){
        return setConfirmEmail();
    }

}
