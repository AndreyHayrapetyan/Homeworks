import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import staffPages.CompanyPage;
import staffPages.MainPage;
import staffPages.SearchPage;

public class StaffAmTest {
    private WebDriver driver;
    private MainPage mainPage;
    private SearchPage searchPage;
    private CompanyPage companyPage;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://staff.am");
        driver.manage().window().maximize();


    }

    @Test
    void test_1() throws InterruptedException {
        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
        companyPage = new CompanyPage(driver);

        mainPage.mainPageActions();
        Thread.sleep(2000);
        searchPage.searchByRandomName();
        Thread.sleep(1000);
        WebElement checkCompaniesFound = driver.findElement(searchPage.getCompaniesNotFound());
        Assertions.assertTrue(checkCompaniesFound.isDisplayed(), "Check for no result");

        searchPage.searchBySer();
        String companiesNumber = driver.findElement(searchPage.getCompaniesNumber()).getText();
        Assertions.assertEquals(Integer.parseInt(companiesNumber) , searchPage.companies.size(), "Check for sum of companies");
        for(WebElement company : searchPage.companies){
            String name = company.findElement(By.xpath("./following-sibling::div/div[1]")).getText().toLowerCase();
            Assertions.assertTrue(name.contains("ser"), "Check if companies names contain 'ser' ");
        }

        searchPage.randomSelectClick();
        Assertions.assertEquals(searchPage.followers, companyPage.companyFollowers(), "Check for same numbers ");
        Assertions.assertEquals(searchPage.activeJobs, companyPage.companyActiveJobs(), "Check for same numbers ");
        Assertions.assertEquals(searchPage.pageViewers, companyPage.companyPageViewers(), "Check for same numbers ");
        Assertions.assertEquals(searchPage.jobHistory, companyPage.companyJobHistory(), "Check for same numbers ");
        Assertions.assertEquals(" Information technologies",  companyPage.industryName());
    }

}
