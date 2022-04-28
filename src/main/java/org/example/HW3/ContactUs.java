package org.example.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ContactUs {
        public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        // Открываем браузер
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        //Блок авторизации
        WebElement signIn = driver.findElement(By.cssSelector("a.login"));
        signIn.click();
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("Tester@mail.ru");
        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.click();
        passwd.sendKeys("test12");
        WebElement submitLogin = driver.findElement(By.id("SubmitLogin"));
        submitLogin.click();

        //Блок заполнения формы обратной связи
            WebElement buttonContactUs = driver.findElement(By.xpath("//a[@title='Contact Us']"));
            buttonContactUs.click();
            WebElement idContact = driver.findElement(By.id("id_contact"));
            idContact.click();
            WebElement chooseId = driver.findElement(By.xpath("//option[@value='2']"));
            chooseId.click();
            WebElement areaMessage = driver.findElement(By.id("message"));
            areaMessage.click();
            areaMessage.sendKeys("Я очень крутой тестировщик!");
            WebElement submitMessage = driver.findElement(By.id("submitMessage"));
            submitMessage.click();
        //driver.quit();
    }

    }
