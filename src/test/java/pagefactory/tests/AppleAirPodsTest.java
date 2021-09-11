package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppleAirPodsTest extends BaseTest {
    @Test
    public void testThatTotalAmountIsChanged() {
        getHomePage().clickAppleAirPodsCategoryBox();
        getHomePage().clickBuy();
        getAppleAirPodsPage().implicitWait(10);
        getAppleAirPodsPage().clickPlus();
        getAppleAirPodsPage().waitForAmountToChange(10);
        assertEquals(getAppleAirPodsPage().getTextFromAmount(), "7398 грн");
    }
}
