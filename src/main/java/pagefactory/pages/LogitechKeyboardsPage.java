package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogitechKeyboardsPage extends BasePage {

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> items;

    public int countItems() {
        return getItemsList().size();
    }

    public List<WebElement> getItemsList() {
        return items;
    }

    public LogitechKeyboardsPage(WebDriver driver) {
        super(driver);
    }
}
