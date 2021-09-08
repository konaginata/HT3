package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppleAirPodsTest extends BaseTest {
    @Test (priority = 2)
    public void testThatTotalAmountIsChanged() {
        getHomePage().clikAppleAirPodsCategoryBox();
        getHomePage().clickBuy();
        getAppleAirPodsPage().implicitWait(10);
        getAppleAirPodsPage().clickPlus();
        getAppleAirPodsPage().waitForAmountToChange(10);
        assertEquals(getAppleAirPodsPage().getTextFromAmount(), "7398 грн");
    }
}
