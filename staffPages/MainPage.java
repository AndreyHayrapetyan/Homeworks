package staffPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.Keys.ENTER;

public class MainPage {
    private WebDriver driver;

    private By companyRadioButton = By.xpath("//div[@tabindex = '0']//div[text() = 'Companies']");
    private By industriesDropDownSelect = By.xpath("//input[@type = 'search']");
    private By dropDownOptionSelect = By.xpath("//div[@title = 'Information technologies']");
    private By searchButton = By.xpath("//img[@alt = 'search-icon']");



    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private void clickOnCompanyButton () throws InterruptedException {
        driver.findElement(companyRadioButton).click();
        Thread.sleep(500);
    }

    private void clickOnIndustriesDropDown() throws InterruptedException {
        driver.findElement(industriesDropDownSelect).sendKeys("Information technologies",ENTER);
        Thread.sleep(1000);
    }


    private void clickOnSearchButton() throws InterruptedException {
        driver.findElement(searchButton).click();
        Thread.sleep(500);
    }

    public void mainPageActions() throws InterruptedException {
        clickOnCompanyButton();
        clickOnIndustriesDropDown();
        clickOnSearchButton();
    }
}
