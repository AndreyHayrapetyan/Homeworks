import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtil {

    private ScreenshotUtil() {
    }

    public static String sanitizeFileName(String input) {
        return input.replaceAll("[\\\\/:*?\"<>|()]", "_"); // replaces invalid chars with "_"
    }

    public static void savePageScreenshot(WebDriver driver, Path path) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshotFile.toPath(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Can't copy the screenshot file:" + e.getMessage());
        }
    }

    public static void addScreenshot(WebDriver driver, String errorType, String testName, String screenshotName) throws IOException {
        String fileName = "Screenshot_on_failure_" + sanitizeFileName(errorType) + "_" + sanitizeFileName(testName) + ".png";
        Path screenshotsDir = Path.of("screenshots");
        Files.createDirectories(screenshotsDir); // create screenshots/ if it doesn't exist
        Path path = screenshotsDir.resolve(fileName); // full path: screenshots/yourfile.png
        ScreenshotUtil.savePageScreenshot(driver, path);
        Allure.addAttachment(screenshotName, "image/png", Files.newInputStream(path), ".png");
    }

    public static void addScreenshot(WebDriver driver, Exception e, String name, String screenshotName) throws IOException {
        addScreenshot(driver, e.getClass().getSimpleName(), name, screenshotName);
    }

}