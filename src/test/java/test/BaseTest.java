package test;

import it.course.App;
import message.Message;
import message.MessageFactory;
import org.testng.annotations.AfterSuite;
import users.User;
import users.UserFactory;

public class BaseTest {
    protected App app = new App();
    protected User validUser = UserFactory.getValidUser();
    protected Message validMessage = MessageFactory.getValidMessage();


    @AfterSuite
    public void afterSuite() {
        app.close.appStop();
    }
}
