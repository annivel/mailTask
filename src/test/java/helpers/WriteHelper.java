package helpers;

import message.Message;
import messageMail.WriteMessage;

public class WriteHelper extends WriteMessage {


    public void writeMail(String adress, String theme, String text) {
        setInputAdress(adress);
        setInputTheme(theme);
        setWriteText(text);
        setSend();
        setSwitchToAllMessage();

    }

    public void writeMail(Message message) {
        writeMail(message.emailAdress, message.theme, message.text);
    }

}