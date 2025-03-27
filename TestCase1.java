import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCase1 {

    static WebDriver driver;
    static String tabName = "Clothing";
    static String subTab = "Men's";
    static String optionName = "T-Shirts";
    static String colorName = "Brown";

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @Tag("TestCase1")
    public void applyFilterAndValidateCount() throws InterruptedException {
        navigateToCategory(tabName, subTab, optionName);
        applyColorFilter(colorName);
        validateProductCountMatchesFilter();
    }
    @Test
    @Tag("TestCase1")
    public void removeFilterAndValidate() throws InterruptedException {
        removeFilter(colorName);
    }




    public void navigateToCategory(String tabName, String subTab, String optionName) throws InterruptedException {
        driver.get("https://6pm.com");
        Actions actions = new Actions(driver);

        By tabLocator = By.xpath("(//a[contains(@href,\"" + tabName.toLowerCase() + "\"" + ") and not(contains(@href,\"/" + tabName.toLowerCase() + "/\"))])[1]");
        WebElement tabElement = driver.findElement(tabLocator);
        actions.moveToElement(tabElement).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[contains(text(), \"" + subTab + "\")]/following-sibling::ul//a[contains(text(), \"" + optionName + "\")]")).click();
        Thread.sleep(2000);
    }

    public void applyColorFilter(String color) throws InterruptedException {
        WebElement expander = driver.findElement(By.xpath("//h3[@id = 'colorFacet']//button[@type = 'button']"));
        expander.click();
        Thread.sleep(1000);

        WebElement colorSelector = driver.findElement(By.xpath("//a[contains(@href, 'men-" + color.toLowerCase() + "-t-shirts')]"));
        colorSelector.click();
        Thread.sleep(3000);
    }

    public void validateProductCountMatchesFilter() {
        List<WebElement> products = driver.findElements(By.xpath("//div[@id = 'products']/article"));
        System.out.println("Product count after filter: " + products.size());
        Assertions.assertTrue(products.size() > 0, "Products should be displayed after applying filter");

        String countText = driver.findElement(By.xpath("//span[contains(text(),'items found')]")).getText();
        Assertions.assertEquals(36, products.size(), "Filter count and actual product count should match");

    }

    public void removeFilter(String color) throws InterruptedException {
        WebElement removeFilter = driver.findElement(By.xpath("//a[@data-singleselect = 'false']"));
        removeFilter.click();
        Thread.sleep(2000);

        boolean isFilterPresent = !driver.findElements(By.xpath("//a[@data-singleselect = 'false']")).isEmpty();
        Assertions.assertFalse(isFilterPresent, "Filter should be removed from the top");

        WebElement colorSelector = driver.findElement(By.xpath("//a[contains(@href, 'men-" + color.toLowerCase() + "-t-shirts')]"));
        String classAttr = colorSelector.getAttribute("class");
        Assertions.assertFalse(classAttr.contains("selected"), "Filter should be unselected in left panel");

        driver.quit();


    }
}
