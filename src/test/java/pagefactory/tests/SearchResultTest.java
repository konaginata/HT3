package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchResultTest extends BaseTest {

    @Test
    public void testThatCheckBoxCallsOnlyHeadphones() {
        getHomePage().searchByKeyword("apple watch");
        getSearchResultPage().clickOnHeadPhonesCheckbox();
        for (WebElement we : getSearchResultPage().getItemsList()) {
            assertTrue(we.getText().contains("Наушники"));
        }
    }
}
