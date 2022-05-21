package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSortByPrice extends NewAuthorization{

    public NewSortByPrice(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "search_query_top")
    private WebElement inputSearch;

    @FindBy (name = "submit_search")
    private WebElement buttonSearch;

    @FindBy (id = "selectProductSort")
    private WebElement selectProductSort;

    @FindBy (xpath = "//option[@value='price:asc']")
    private WebElement priceAsc;

    @FindBy (css = ".product-count")
    private WebElement extradition;

    public NewSortByPrice inputSearchSendKeys() {
        inputSearch.click();
        inputSearch.sendKeys("Dress");
        return this;
    }

    public NewSortByPrice  buttonSearchClick() {
        buttonSearch.click();
        return this;
    }

    public NewSortByPrice  selectProductSortClick() {
        selectProductSort.click();
        return this;
    }

    public NewSortByPrice  priceAscClick() {
        priceAsc.click();
        return this;
    }

    public String getResultExtradition () {
        String resultExtradition = extradition.getText();
        return resultExtradition;
    }
}
