package HW6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewResetPasswordTest extends MyAbstractTest{

    @Test
    public void newResetPasswordTest () {
        NewResetPassword newResetPassword = new NewResetPassword(getDriver());
        newResetPassword
                .signInClick()
                .forgotPasswordClick()
                .emailSendKeys()
                .buttonClick();

        Assertions.assertEquals("A confirmation email has been sent to your address: Tester@mail.ru", newResetPassword.getSuccessMessage(), "unsuccessful");
    }
}
