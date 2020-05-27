package message;

import java.util.Objects;

public class Message {
    public String emailAdress;
    public String theme;
    public String text;

    public Message(String emailAdress, String theme, String text) {
        this.emailAdress = emailAdress;
        this.theme = theme;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(emailAdress, message.emailAdress) &&
                Objects.equals(theme, message.theme) &&
                Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAdress, theme, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "emailAdress='" + emailAdress + '\'' +
                ", theme='" + theme + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
