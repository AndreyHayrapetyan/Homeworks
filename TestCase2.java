import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;
@Tag("UI")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestCase2 {

    WebDriver driver;
    List<WebElement> products;
    String selectedProductName;
    String selectedProductPrice;

    @BeforeAll
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://6pm.com");
    }

    @Test
    @Tag("TestCase2")
    void testProductFlow() throws InterruptedException {
        productInfo("Bags", "All Bags", "Luggage");
        selectRandomProduct();
        validateProductDetails();
        addToCartAndRemove();
    }

    void productInfo(String tabName, String subTab, String optionName) throws InterruptedException {
        By tabLocator = By.xpath("(//a[contains(@href,\"" + tabName.toLowerCase() + "\"" + ") and not(contains(@href,\"/" + tabName.toLowerCase() + "/\"))])[1]");
        WebElement tabElement = driver.findElement(tabLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(tabElement).perform();
        Thread.sleep(3000);

        optionName = optionName.substring(0, 1).toUpperCase() + optionName.substring(1).toLowerCase();
        driver.findElement(By.xpath("//*[contains(text(), \"" + subTab + "\")]/following-sibling::ul//a[contains(text(), \"" + optionName + "\")]")).click();
        Thread.sleep(4000);

        products = driver.findElements(By.xpath("//div[@id='products']/article"));
    }

    void selectRandomProduct() {
        Random random = new Random();
        int randomIndex = random.nextInt(products.size());
        WebElement selectedProduct = products.get(randomIndex);
        selectedProductName = selectedProduct.findElement(By.xpath("./div[2]/a/dl/dd[2]")).getText();
        selectedProductPrice = selectedProduct.findElement(By.xpath("./div[2]/a/dl/dd[4]/span[1]")).getText();
        selectedProduct.click();
    }

    void validateProductDetails() throws InterruptedException {
        Thread.sleep(3000);
        WebElement productName = driver.findElement(By.xpath("//div[contains(@class, 'flex')]/div/h1/div/span[2]"));
        WebElement productPrice = driver.findElement(By.xpath("//span[@itemprop = 'price']/span[1]"));
        Assertions.assertEquals(selectedProductName, productName.getText(), "Product name does not match");
        Assertions.assertEquals(selectedProductPrice, productPrice.getText(), "Product price does not match");
    }

    void addToCartAndRemove() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addToCart = driver.findElement(By.xpath("//button[@id=\"add-to-cart-button\"]"));
        addToCart.click();
        Thread.sleep(3000);

        WebElement remove = driver.findElement(By.xpath("//button[@aria-label=\"Remove Item\"]"));
        remove.click();
        Thread.sleep(3000);

        Assertions.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'/marty-assets/empty-cart')]")).isDisplayed(),
                "Cart is not empty after removing the product");


        driver.quit();

    }
}
