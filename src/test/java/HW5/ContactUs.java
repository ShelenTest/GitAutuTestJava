package HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ContactUs extends MyAbstractTest {

    @Test
    public void contactUs () {
        //Блок авторизации
        WebElement signIn = getDriver().findElement(By.cssSelector("a.login"));
        signIn.click();
        WebElement email = getDriver().findElement(By.id("email"));
        email.click();
        email.sendKeys("Tester@mail.ru");
        WebElement passwd = getDriver().findElement(By.id("passwd"));
        passwd.click();
        passwd.sendKeys("test12");
        WebElement submitLogin = getDriver().findElement(By.id("SubmitLogin"));
        submitLogin.click();

        //Блок заполнения формы обратной связи
            WebElement buttonContactUs = getDriver().findElement(By.xpath("//a[@title='Contact Us']"));
            buttonContactUs.click();
            WebElement idContact = getDriver().findElement(By.id("id_contact"));
            idContact.click();
            WebElement chooseId = getDriver().findElement(By.xpath("//option[@value='2']"));
            chooseId.click();
            WebElement areaMessage = getDriver().findElement(By.id("message"));
            areaMessage.click();
            areaMessage.sendKeys("Я очень крутой тестировщик!");
            WebElement submitMessage = getDriver().findElement(By.id("submitMessage"));
            submitMessage.click();

            // Блок проверки
            WebElement message = getDriver().findElement(By.cssSelector("p.alert "));
            String message_success = message.getText();
            Assertions.assertEquals("Your message has been successfully sent to our team.", message_success, "unsuccessful");

    }

    }
