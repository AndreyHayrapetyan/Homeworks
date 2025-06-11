import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import staffAMPages.Company;
import staffAMPages.DriverGenerator;
import staffAMPages.MainPage;
import staffAMPages.ResultsPage;
import staffAMPages.DefaultPage;


import java.util.List;

public class StaffAMTest2 {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = DriverGenerator.getDriver();
        driver.get("https://staff.am");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void quitDriver() {
        DriverGenerator.quitDriver();
    }

    @Test
    @Tag("UI")
    public void test() throws InterruptedException {

        MainPage mainPage = new MainPage();
        ResultsPage resultsPage = new ResultsPage();
        mainPage.click(mainPage.header.companiesLocator);
        Thread.sleep(2000);
        resultsPage.clickOnViewMoreLocator();
        Thread.sleep(2000);
        resultsPage.clickOnSportsSectionLocator();
        Thread.sleep(2000);
        List<Company> allCompaniesList = resultsPage.getCompaniesList();
        resultsPage.clickOnHiringButton();
        Thread.sleep(2000);
        List<Company> hiringCompaniesList = resultsPage.getCompaniesList();
        mainPage.click(mainPage.footer.viewAllCompaniesLocator);
        Thread.sleep(2000);
        resultsPage.clickOnSportsSectionLocator();
        Thread.sleep(2000);
        List<Company> allCompaniesList2 = resultsPage.getCompaniesList();
        resultsPage.clickOnHiringButton();
        Thread.sleep(2000);
        List<Company> hiringCompaniesList2 = resultsPage.getCompaniesList();
        Assertions.assertTrue(allCompaniesList.equals(allCompaniesList2));
        Assertions.assertTrue(hiringCompaniesList.equals(hiringCompaniesList2));
    }
}
