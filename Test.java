import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test {
    WebDriver driver = new ChromeDriver();


    JobPage j = new JobPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeAll
    public void goTo() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://staff.am/jobs");
        Thread.sleep(1500);
        System.out.println(j.viewMoreButton.size() + " SIZE");
        j.clickOnAllViewMoreButtons();
    }



    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6})
    public void a(int number) throws InterruptedException {
        String[] names = j.filtersWebElementList.get(number).getText().split("\n");
        System.out.println(Arrays.toString(names));
        List<String> a = new ArrayList<>();
        for (int i = 1; i < names.length - 1; i++) {
            a.add(names[i]);
        }
        Random random = new Random();
        String name1 = a.get(random.nextInt(a.size()));
        String name2 = "";

        name2 = a.get(random.nextInt(a.size()));


        Assertions.assertTrue(j.validateCount(name1, name2));

    }

}