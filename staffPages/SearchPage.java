package staffPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Random;

public class SearchPage {
    WebDriver driver;
    public List<WebElement> companies;
    Random random = new Random();
    public int pageViewers;
    public int followers;
    public int activeJobs;
    public int jobHistory;


    private final By enterKeyword = By.xpath("//input[@placeholder = 'Enter keywords...']");
    private final By companiesNotFound = By.xpath("//img[@alt='search-not-found']");
    private final By searchButton = By.xpath("//div[text() = 'Search']");
    private final By companiesNumber = By.xpath("//img[@alt = 'building']//following-sibling::div");
    private final String randomSearchTerm = "XYZ" + new Random().nextInt(100000);

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchByRandomName () throws InterruptedException {
        driver.findElement(enterKeyword).sendKeys(randomSearchTerm);
        driver.findElement(searchButton).click();
        Thread.sleep(500);
    }

    public By getCompaniesNotFound(){
        return companiesNotFound;
    }

    public By getCompaniesNumber(){
        return companiesNumber;
    }



    public  void searchBySer() throws InterruptedException {
        driver.findElement(enterKeyword).clear();
        driver.findElement(enterKeyword).sendKeys("ser");
        driver.findElement(searchButton).click();
        Thread.sleep(3000);
        companies = driver.findElements(By.xpath("//img[@alt=\"company-logo\"]"));
        for (WebElement company : companies) {
            String name = company.findElement(By.xpath("./following-sibling::div/div[1]")).getText();
            System.out.println(name);
        }
        Thread.sleep(5000);
    }


    public void randomSelectClick(){
        Actions actions = new Actions(driver);
        int randomSelection = random.nextInt(companies.size() + 1);
        actions.moveToElement(companies.get(randomSelection)).perform();
        pageViewers = Integer.parseInt(driver.findElement(By.xpath("(" + "//img[@alt='eye-icon']/following-sibling::div" + ")[" + (randomSelection + 1) + "]")).getText().split(" ")[0]);
        followers = Integer.parseInt(driver.findElement(By.xpath("(" + "//img[@alt='people-icon']/following-sibling::div" + ")[" + (randomSelection + 1) + "]")).getText().split(" ")[0]);
        activeJobs = Integer.parseInt(driver.findElement(By.xpath("(" + "//img[@alt='active-jobs']/following-sibling::div" + ")[" + (randomSelection + 1) + "]")).getText().split(" ")[0]);
        jobHistory = Integer.parseInt(driver.findElement(By.xpath("(" + "//img[@alt='timer']/following-sibling::div" + ")[" + (randomSelection + 1) + "]")).getText().split(" ")[0]);
        companies.get(randomSelection).click();

        }


    }

