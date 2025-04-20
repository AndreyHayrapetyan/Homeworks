package RegisterHomework;

import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.NoSuchElementException;

public class DropdownComponentClass extends BaseActions {
    private String baseXpath;

    public DropdownComponentClass(String baseXpath) {
        this.baseXpath = baseXpath;
    }

    public void hoverOnDropdown() {
        waitFor(ExpectedConditions.elementToBeClickable(findElement(baseXpath)));
        hover(baseXpath);
    }

    public void clickOnDropDown() {
        click(baseXpath);
    }

    public void clickOnDropdownVariant(String variant) {
        click(baseXpath + "/parent::div/following-sibling::div//div[contains(text(),\"" + variant + "\")]");
    }

    private void clickOnDropdownVariantByTitle(String title) {
        click("//div[@title=\"" + title + "\"]");
    }

    private void setBaseXpath(String newBaseXPath) {
        this.baseXpath = "//span/input[@type=\"search\"]/parent::span/following-sibling::span/div[contains(text(),\"" + newBaseXPath + "\")]/parent::span/parent::div";
    }


    public void clickOptionFromDropdown(String dropdownName, String option) throws InterruptedException {
        setBaseXpath(dropdownName);
        hoverOnDropdown();
        clickOnDropDown();
        try {
            clickOnDropdownVariantByTitle(option);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}