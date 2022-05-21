package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewContactUs extends NewAuthorization {

    public NewContactUs(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement buttonContactUs;

    @FindBy(id = "id_contact")
    private WebElement idContact;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement chooseId;

    @FindBy(id = "message")
    private WebElement areaMessage;

    @FindBy(id = "submitMessage")
    private WebElement submitMessage;

    @FindBy(css = "p.alert ")
    private WebElement alert;

    public NewContactUs buttonContactUsClick() {
        buttonContactUs.click();
        return this;
    }

    public NewContactUs idContactClick() {
        idContact.click();
        return this;
    }

    public NewContactUs chooseIdClick() {
        chooseId.click();
        return this;
    }

    public NewContactUs areaMessageSendKeys() {
        areaMessage.click();
        areaMessage.sendKeys("Я очень крутой тестировщик!");
        return this;
    }

    public NewContactUs submitMessageClick() {
        submitMessage.click();
        return this;
    }

    public String messageGet() {
        String messageSuccess = alert.getText();
        return messageSuccess;
    }
}
