package staffAMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class DefaultPage {
    protected WebDriver driver = DriverGenerator.getDriver();

    Header header;
    Footer footer;

}
