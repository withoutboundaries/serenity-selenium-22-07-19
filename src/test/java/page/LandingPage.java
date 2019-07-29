package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.linkedin.com")
public class LandingPage extends PageObject {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

}