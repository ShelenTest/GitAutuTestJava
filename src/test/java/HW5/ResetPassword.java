package HW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResetPassword extends MyAbstractTest {

    @Test
    public void resetPassword () {

        //Блок сброса пароля
        WebElement signIn = getDriver().findElement(By.cssSelector("a.login"));
        signIn.click();
        WebElement forgotPassword = getDriver().findElement(By.xpath("//*[@title='Recover your forgotten password']"));
        forgotPassword.click();
        WebElement email = getDriver().findElement(By.id("email"));
        email.click();
        email.sendKeys("Tester@mail.ru");
        WebElement button = getDriver().findElement(By.cssSelector("button.btn.btn-default.button.button-medium"));
        button.click();

        // Блок проверки, что новый пароль отправлен на почту

        WebElement message = getDriver().findElement(By.cssSelector(".alert.alert-success"));
        String successMessage = message.getText();
        Assertions.assertEquals("A confirmation email has been sent to your address: Tester@mail.ru", successMessage, "unsuccessful");

    }

}
