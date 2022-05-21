package HW6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewSortByPriceTest extends MyAbstractTest{

    @Test
    public void newSortByPriceTest () {
        NewAuthorization newAuthorization = new NewAuthorization(getDriver());
        newAuthorization
                .singInClick()
                .emailSendKeys("Tester@mail.ru")
                .passwdSendKeys("test12")
                .submitLoginClick();

        NewSortByPrice newSortByPrice = new NewSortByPrice (getDriver());
        newSortByPrice
                .inputSearchSendKeys()
                .buttonSearchClick()
                .selectProductSortClick()
                .priceAscClick();

        Assertions.assertEquals("Showing 1 - 7 of 7 items", newSortByPrice.getResultExtradition(), "unsuccessful");
    }
}
