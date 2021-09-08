package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;
    //
//    @FindBy(xpath = "//span[@class='sidebar-item']")
//    private WebElement productCatalogButton;
//
//    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
//    private WebElement appleSoreButton;
//
//    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
//    private WebElement amountOfProductsInCart;
//
    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text( )='Компьютеры']")
    private WebElement computersButton;

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[@href='https://avic.ua/klaviaturyi']")
    private WebElement keyboardsButton;

    @FindBy(xpath = "//img[@src='https://avic.ua/assets/cache/menus/1/logitech-klava-7-prod_xs_menu.jpg']")
    private WebElement logitechButton;

    @FindBy(xpath = "//a[ text( )='Условия рассрочки' and @class='header-top__item']")
    private WebElement installmentTermsButton;

    @FindBy(xpath = "//a[ text( )='Контакты' and @class='header-top__item']")
    private WebElement contactsButton;

    @FindBy(xpath = "//img[@src='https://avic.ua/assets/cache/products/244460/apple-airpods-with-charging-case-mv7n2-1-prod_main.jpg']")
    private WebElement appleAirPodsCategoryBox;

    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement buy;

//    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
//    private WebElement plus;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void moveToComputers() {
        Actions actions = new Actions(driver);
        actions.moveToElement(computersButton).build().perform();
    }

    public void moveToKeyboards() {
        Actions actions = new Actions(driver);
        actions.moveToElement(keyboardsButton).build().perform();
    }

    public void clickOnLogitechButton() {
        logitechButton.click();
    }


    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clikInstallmentTermsButton() {
        installmentTermsButton.click();
    }

    public void clikContactsButton() {
        contactsButton.click();
    }

    public void clikAppleAirPodsCategoryBox() {
        appleAirPodsCategoryBox.click();
    }

    public void clickBuy() {buy.click();}

//    public void clickPlus() {plus.click();}
//
//    public void clickOnProductCatalogButton() {
//        productCatalogButton.click();
//    }
//
//    public void clickOnAppleStoreButton() {
//        appleSoreButton.click();
//    }
//
//    public String getTextOfAmountProductsInCart() {
//        return amountOfProductsInCart.getText();
//    }

}
