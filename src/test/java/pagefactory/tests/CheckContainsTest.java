package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CheckContainsTest extends BaseTest {

    @Test (priority =2)
    public void testThatUrlContainsWords() {
        getHomePage().clikInstallmentTermsButton();
        getHomePage().clikContactsButton();
        assertFalse(getCurrentUrl().contains("usloviya-rassrochki"));
    }
}
