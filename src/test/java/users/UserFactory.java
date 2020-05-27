package users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle user= ResourceBundle.getBundle("user");
    public static  User getValidUser(){
        return new User(user.getString("userName"),
                user.getString("password"),
                user.getString("email"));


    }
}

