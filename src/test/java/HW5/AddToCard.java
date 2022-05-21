package HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddToCard extends MyAbstractTest {

@Test
    public void addToCard () {
        // Добавление товара в корзину для неавторизованного пользователя
        WebElement blouse = getDriver().findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//a[@class='product_img_link'] [@title='Blouse']"));
        blouse.click();
        WebElement frame = getDriver().findElement(By.cssSelector("iframe[class=\"fancybox-iframe\"]"));
        getDriver().switchTo().frame(frame);

        WebElement button_add_to_cart = getDriver().findElement(By.xpath("//p[@id = 'add_to_cart']/button"));
        button_add_to_cart.click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e){
        e.printStackTrace();
    }

        getDriver().switchTo().alert();

        WebElement button_continue = getDriver().findElement(By.cssSelector(".cross"));

    // WebElement button_continue = getDriver().findElement(By.xpath("//*[@title='Continue shopping']"));
    // button_continue.click();

   // WebElement cardValue = getDriver().findElement(By.cssSelector(".shopping_cart .ajax_cart_quantity "));
    //String result = cardValue.getText();
   // Assertions.assertEquals("1", result, "Не 1");

    }
    }

