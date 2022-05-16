package org.example.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Authorization {
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

        //driver.quit();
        }

    }

