package HW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GoToNewPage extends MyAbstractTest{

    @Test
    public void goToNewPage() {
        WebElement buttonYoutube = getDriver().findElement(By.xpath("//li[@class='youtube']/a"));
        buttonYoutube.click();
        ArrayList<String> windowTabs = new ArrayList (getDriver().getWindowHandles());
        getDriver().switchTo().window(windowTabs.get(1));

        String myUrl = getDriver().getCurrentUrl();

        Assertions.assertTrue(myUrl.contains("youtube"));
    }
}
