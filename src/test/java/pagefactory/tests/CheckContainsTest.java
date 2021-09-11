package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CheckContainsTest extends BaseTest {

    @Test
    public void testThatUrlContainsWords() {
        getHomePage().clickInstallmentTermsButton();
        getHomePage().clickContactsButton();
        assertFalse(getCurrentUrl().contains("usloviya-rassrochki"));
    }
}
