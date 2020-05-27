package message;

import java.util.ResourceBundle;

public class MessageFactory {
    private static ResourceBundle message = ResourceBundle.getBundle("message");
    public static Message getValidMessage (){
        return new Message(message.getString("emailAdress"),
                message.getString("theme"),
                message.getString("text"));
    }
}
