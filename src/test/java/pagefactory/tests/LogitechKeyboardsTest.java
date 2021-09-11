package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogitechKeyboardsTest extends BaseTest {
    @Test
    public void testThatLogitechKeyboardsPageShows12Items() {
        getHomePage().implicitWait(10);
        getHomePage().moveToComputers();
        getHomePage().moveToKeyboards();
        getHomePage().clickOnLogitechButton();
        assertEquals(getLogitechKeyboardsPage().countItems(), 12);
    }
}
