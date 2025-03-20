import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.nio.file.WatchEvent;
import java.util.List;
import java.util.Random;

public class Testing {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://6pm.com");
        Actions action = new Actions(driver);

        driver.manage().window().maximize();
        WebElement selectBags = driver.findElement(By.cssSelector("a[href = '/c/bags']"));
        action.moveToElement(selectBags).perform();
        WebElement luggageFinder = driver.findElement(By.xpath("//a[text()='Luggage']"));

        Thread.sleep(1000);

        luggageFinder.click();

        Thread.sleep(3000);


        List<WebElement> products = driver.findElements(By.xpath("//div[@id='products']/article"));


        Thread.sleep(3000);
        for (WebElement product : products) {
            String name = product.findElement(By.xpath("./div[2]/a/dl/dd[2]")).getText();
            String price = product.findElement(By.xpath("./div[2]/a/dl/dd[4]/span[1]")).getText();
            System.out.println(name + " : " + price);
        }




        Random random = new Random();
        if (!products.isEmpty()) {
            int randomIndex = random.nextInt(products.size());
            products.get(randomIndex).click();

        }

        Thread.sleep(3000);

        WebElement productName = driver.findElement(By.xpath("//div[contains(@class, 'flex')]/div/h1/div/span[2]"));
        WebElement productPrice = driver.findElement(By.xpath("//span[@itemprop = 'price']/span[1]"));
        System.out.println("Selected Product: " + productName.getText() + ", Price: " + productPrice.getText());

        Thread.sleep(3000);
        WebElement addToCart = driver.findElement( By.xpath("//button[@id=\"add-to-cart-button\"]"));
        addToCart.click();
        Thread.sleep(3000);
        WebElement remove = driver.findElement( By.xpath("//button[@aria-label=\"Remove Item\"]"));
        remove.click();
        Thread.sleep(3000);
        WebElement signIn = driver.findElement(By.xpath("(//a[contains(@href,\"/zap/preAuth/signin\")])[2]"));
        System.out.println(signIn.getAttribute("href"));
        Thread.sleep(10000);
        driver.quit();

    }
}

/* WebDriver driver = new ChromeDriver();
driver.get("https://amazon.com");
driver.manage().window().maximize();
By inputFieldLocator = By.id("twotabsearchtextbox");

Thread.sleep(3000);

WebElement searchField = driver.findElement(inputFieldLocator);
searchField.sendKeys("jeans");

By searchButton = By.id("nav-search-submit-button");
driver.findElement(searchButton).click(); */