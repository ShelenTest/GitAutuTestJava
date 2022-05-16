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

public class Authorization extends MyAbstractTest {

   @Test
    public void authorization() {

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

        // Блок проверки
        WebElement account_name = getDriver().findElement(By.cssSelector(".account>span"));
        String my_name = account_name.getText();
        Assertions.assertEquals("Elena Shevsova", my_name, "Wrong profile name" );
        }

    }

