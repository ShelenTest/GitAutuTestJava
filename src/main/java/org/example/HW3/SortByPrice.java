package org.example.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SortByPrice {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
    //options.addArguments("--headless");
        options.addArguments("start-maximized");

    // Открываем браузер
    WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
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

        //Блок сортировки

        WebElement inputSearch = driver.findElement(By.id("search_query_top"));
        inputSearch.click();
        inputSearch.sendKeys("Dress");
        WebElement buttonSearch = driver.findElement(By.name("submit_search"));
        buttonSearch.click();
        WebElement selectProductSort = driver.findElement(By.id("selectProductSort"));
        selectProductSort.click();
        WebElement priceAsc = driver.findElement(By.xpath("//option[@value='price:asc']"));
        priceAsc.click();

        //driver.quit();
}}
