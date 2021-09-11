package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleAirPodsPage extends BasePage {

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement plus;

    @FindBy(xpath = "//div[@class='item-total']/span[@class='prise']")
    private WebElement price;

    public AppleAirPodsPage(WebDriver driver) {
        super(driver);
    }

    public void waitForAmountToChange(long timeToWait) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.textToBePresentInElement(price, "7398 грн"));
    }

    public String getTextFromAmount() {
        return price.getText();
    }

    public void clickPlus() {
        plus.click();
    }
}
