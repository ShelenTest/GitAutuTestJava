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

public class SortByPrice extends MyAbstractTest{

   @Test
    public void sortByPrice() {


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

        //Блок сортировки

        WebElement inputSearch = getDriver().findElement(By.id("search_query_top"));
        inputSearch.click();
        inputSearch.sendKeys("Dress");
        WebElement buttonSearch = getDriver().findElement(By.name("submit_search"));
        buttonSearch.click();
        WebElement selectProductSort = getDriver().findElement(By.id("selectProductSort"));
        selectProductSort.click();
        WebElement priceAsc = getDriver().findElement(By.xpath("//option[@value='price:asc']"));
        priceAsc.click();

        // Блок проверки
       WebElement extradition = getDriver().findElement(By.cssSelector(".product-count"));
       String result_extradition = extradition.getText();
       Assertions.assertEquals("Showing 1 - 7 of 7 items", result_extradition, "unsuccessful");


}}
