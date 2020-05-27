package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test
    public void testFirst() throws InterruptedException {

        app.login.setlogin(validUser);
        app.makeMessag.clickMakeMsg();
        app.write.writeMail(validMessage.emailAdress, validMessage.theme, validMessage.text);
        app.newMailInfo.clickNewMailTime();
        Assert.assertEquals(app.newMailInfo.takeAdress(),validUser.email);
        System.out.println("email has sent to " + app.newMailInfo.takeAdress());



    }

}