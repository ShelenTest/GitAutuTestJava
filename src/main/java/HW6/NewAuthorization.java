package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAuthorization extends Abstract {

    public NewAuthorization(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.login")
    private WebElement signIn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passwd;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    @FindBy(css = ".account>span")
    private WebElement accountName;

    public NewAuthorization singInClick () {
        signIn.click();
        return this;
    }

    public NewAuthorization emailSendKeys (String myEmail) {
        email.click();
        email.sendKeys(myEmail);
        return this;
    }

    public NewAuthorization passwdSendKeys (String myPasswd) {
        passwd.click();
        passwd.sendKeys(myPasswd);
        return this;
    }

    public NewAuthorization submitLoginClick () {
        submitLogin.click();
        return this;
    }

    public String accountNameGetText () {
        String myName = accountName.getText();
        return myName;
    }
    }


