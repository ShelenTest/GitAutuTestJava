package HW6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewGoToNewPageTest extends MyAbstractTest{

    @Test
            public void newGoToNewPage () {
        NewGoToNewPage newGoToNewPage = new NewGoToNewPage(getDriver());
        newGoToNewPage.goToNewPage();

        Assertions.assertTrue(newGoToNewPage.returnMyUrl().contains("youtube"));
    }
}
