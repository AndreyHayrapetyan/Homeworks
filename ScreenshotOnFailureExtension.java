import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ScreenshotOnFailureExtension implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        WebDriver driver = SingleTon.INSTANCE.getDriver();
        String testName = context.getDisplayName();

        try {
            ScreenshotUtil.addScreenshot(driver, throwable.getClass().getSimpleName(), testName, "Screenshot on test failure");
        } catch (IOException e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }

        throw throwable;
    }
}
