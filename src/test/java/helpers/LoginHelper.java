package helpers;

import pagesMail.LoginInput;
import users.User;

public class LoginHelper extends LoginInput {

    public void setlogin (String login, String password) {
        setInputLogin(login);
        setInputPassword(password);
        setClickEnter();
    }

    public void setlogin (User user) {
        setlogin (user.userName, user.password);
    }
}
