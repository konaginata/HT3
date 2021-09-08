package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//label[@for='fltr-category-662']")
    private WebElement headPhonesCheckbox;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> items;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnHeadPhonesCheckbox() {
        headPhonesCheckbox.click();
    }

    public List<WebElement> getItemsList() {
        return items;
    }
}
