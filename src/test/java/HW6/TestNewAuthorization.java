package HW6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestNewAuthorization extends MyAbstractTest{

    @Test
    void testNewAuthorization () {
        NewAuthorization newAuthorization = new NewAuthorization(getDriver());
        newAuthorization
                .singInClick()
                .emailSendKeys("Tester@mail.ru")
                .passwdSendKeys("test12")
                .submitLoginClick();
        Assertions.assertEquals("Elena Shevsova", newAuthorization.accountNameGetText() , "Wrong profile name" );
    }
}
