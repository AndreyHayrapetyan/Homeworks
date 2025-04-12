package staffAMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends DefaultPage {
    Actions actions = new Actions(driver);

    public Header header;
    public Footer footer;

    public MainPage() {
        this.header = new Header();
        this.footer = new Footer();
    }



    public static class Header {
        public By companiesLocator = By.xpath("//a/div[contains(text(),'Companies')]");
    }

    public static class Footer {
        public By viewAllCompaniesLocator = By.xpath("//div[contains(text(),'Companies')]/parent::div/div[last()]");
    }


    public void click(By locator) {
        moveToElement(locator);
        driver.findElement(locator).click();
    }

    public void moveToElement(By locator) {
        actions.moveToElement(driver.findElement(locator)).perform();
    }
}
