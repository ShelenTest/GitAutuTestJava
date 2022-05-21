package HW6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NewContactUsTest extends MyAbstractTest{

    @Test
    void newContactUsTest () {

            NewAuthorization newAuthorization = new NewAuthorization(getDriver());
            newAuthorization
                    .singInClick()
                    .emailSendKeys("Tester@mail.ru")
                    .passwdSendKeys("test12")
                    .submitLoginClick();
        NewContactUs newContactUs = new NewContactUs(getDriver());
        newContactUs
                .buttonContactUsClick()
                .idContactClick()
                .chooseIdClick()
                .areaMessageSendKeys()
                .submitMessageClick();
        Assertions.assertEquals("Your message has been successfully sent to our team.", newContactUs.messageGet(), "unsuccessful");

    }

}
