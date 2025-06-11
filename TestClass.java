import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.*;

@ExtendWith(ScreenshotOnFailureExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass {

    static WebDriver driver = SingleTon.INSTANCE.getDriver();
    static JobPage jobPage = new JobPage(driver);

    @BeforeAll
    public static void goTo() throws IOException {
        driver.manage().window().maximize();
        driver.get("https://staff.am/jobs");
    }

    @AfterAll
    public void quitDriver() {
        SingleTon.INSTANCE.quitDriver();
    }

    @ParameterizedTest
    @Tag("UI")
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
    public void testFilterValidationWithRandomSelection(int filterIndex) throws Exception {
        String[] filterItems = jobPage.filtersWebElementList.get(filterIndex).getText().split("\n");
        List<String> filterNames = new ArrayList<>();

        if (filterItems.length > 5) {
            filterNames.addAll(Arrays.asList(filterItems).subList(1, filterItems.length - 1));
        } else {
            filterNames.addAll(Arrays.asList(filterItems).subList(1, filterItems.length));
        }

        Random random = new Random();
        int firstIndex = random.nextInt(filterNames.size());
        String firstFilter = filterNames.get(firstIndex);

        int secondIndex;
        do {
            secondIndex = random.nextInt(filterNames.size());
        } while (secondIndex == firstIndex);
        String secondFilter = filterNames.get(secondIndex);

        // Take a screenshot before the validations
        ScreenshotUtil.addScreenshot(driver, new Exception("PreValidation"), "Scrn", "Initial state before validation");

        Assertions.assertTrue(jobPage.combinedFilterCount(firstFilter));
        jobPage.clearAllFilters();
        Assertions.assertTrue(jobPage.combinedFilterCount(firstFilter, secondFilter));
        Assertions.assertTrue(jobPage.combinedFilterCount(secondFilter));
    }
}
