package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewResetPassword extends Abstract{


    public NewResetPassword(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "a.login")
    private WebElement signIn;

    @FindBy (xpath = "//*[@title='Recover your forgotten password']")
    private WebElement forgotPassword;

    @FindBy (id = "email")
    private WebElement email;

    @FindBy (css = "button.btn.btn-default.button.button-medium")
    private WebElement button;

    @FindBy (css = ".alert.alert-success")
    private WebElement message;

    public NewResetPassword signInClick () {
        signIn.click();
        return this;
    }

    public NewResetPassword forgotPasswordClick () {
        forgotPassword.click();
        return this;
    }

    public NewResetPassword emailSendKeys() {
        email.click();
        email.sendKeys("Tester@mail.ru");
        return this;
    }

    public NewResetPassword buttonClick () {
        button.click();
        return this;
    }


    public String getSuccessMessage () {
        String successMessage = message.getText();
        return successMessage;
    }
}
