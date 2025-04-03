package staffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompanyPage {
    WebDriver driver;

    private final By pageViewersLoc = By.xpath("(//img[@alt='eye-icon']/parent::div/following-sibling::div)[1]");
    private final By followersLoc = By.xpath("(//img[@alt='people-icon']/parent::div/following-sibling::div)[1]");
    private final By activeJobLoc = By.xpath("//img[@alt='activeJob-icon']/following-sibling::div");
    private final By jobHistoryLoc = By.xpath("(//img[@alt='timer-icon']/parent::div/following-sibling::div)[1]");
    private final By industryNameLoc = By.xpath("//div[contains(text(), 'Industry')]/following-sibling::div");

    public CompanyPage(WebDriver driver){
        this.driver = driver;
    }

    public int companyPageViewers(){
        return Integer.parseInt(driver.findElement(pageViewersLoc).getText().split(" ")[0]);
    }
    public int companyFollowers(){
        return Integer.parseInt(driver.findElement(followersLoc).getText().split(" ")[0]);
    }
    public int companyActiveJobs(){
        return Integer.parseInt(driver.findElement(activeJobLoc).getText().split(" ")[0]);
    }
    public int companyJobHistory () {
        return Integer.parseInt(driver.findElement(jobHistoryLoc).getText().split(" ")[0]);
    }
    public String industryName(){
        return driver.findElement(industryNameLoc).getText();
    }
}
