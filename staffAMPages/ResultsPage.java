package staffAMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ResultsPage extends DefaultPage {
     Actions action = new Actions(driver);
    private final By viewMoreLocator = By.xpath("//div[contains(text(),'Filter By Industry')]/following-sibling::div[last()]");
    private final By sportsSectionLocator = By.xpath("//div[contains(text(),'Filter By Industry')]/following-sibling::div//span[contains(text(), 'Sport') and not(contains(text(),'Betting'))]");


    private final By resultsCountLocator = By.xpath("//img[@alt='building']//following-sibling::div");
    private final By hiringButtonLocator = By.xpath("//div[contains(text(),'Hiring')]");


    private final String nameLocator = "(//img[@alt='company-logo']/following-sibling::div/div/div/div[text()])";
    private final String pageViewCountLocator = "(//img[@alt='eye-icon']//following-sibling::div)";
    private final String followerCountLocator = "(//img[@alt='people-icon']//following-sibling::div)";
    private final String activeJobsCountLocator = "(//img[@alt='active-jobs']//following-sibling::div)";
    private final String jobHistoryNumberLocator = "(//img[@alt='timer' ]//following-sibling::div)";

    public void clickOnViewMoreLocator() {
        action.moveToElement(driver.findElement(viewMoreLocator)).perform();
        driver.findElement(viewMoreLocator).click();

    }

public void clickOnSportsSectionLocator() {
    action.moveToElement(driver.findElement(sportsSectionLocator)).perform();
    driver.findElement(sportsSectionLocator).click();
}

public int getCompaniesCount() {
    return Integer.parseInt(driver.findElement(resultsCountLocator).getText());
}

public List<Company> getCompaniesList() {
    int count = getCompaniesCount();
    List<Company> companies = new ArrayList<>();
    for (int i = 1; i < count + 1; i++) {
        String companyName = driver.findElement((By.xpath(nameLocator + "[" + i + "]"))).getText();
        By companyPageViewCountLocator = By.xpath(pageViewCountLocator + "[" + i + "]");
        By companyFollowerCountLocator = By.xpath(followerCountLocator + "[" + i + "]");
        By companyActiveJobsLocator = By.xpath(activeJobsCountLocator + "[" + i + "]");
        By companyJobHistoryNumberLocator = By.xpath(jobHistoryNumberLocator + "[" + i + "]");
        companies.add(new Company(companyName));
    }
    return companies;
}

public void clickOnHiringButton() {
    action.moveToElement(driver.findElement(hiringButtonLocator)).perform();
    driver.findElement(hiringButtonLocator).click();
}
}