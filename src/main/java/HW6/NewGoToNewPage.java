package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class NewGoToNewPage extends Abstract{

    public NewGoToNewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='youtube']/a")
    private WebElement buttonYoutube;

    public NewGoToNewPage goToNewPage() {
        buttonYoutube.click();
        ArrayList<String> windowTabs = new ArrayList (getDriver().getWindowHandles());
        getDriver().switchTo().window(windowTabs.get(1));
        return this;

    }

    public String returnMyUrl () {
        String myUrl = getDriver().getCurrentUrl();
        return myUrl;
    }

}
