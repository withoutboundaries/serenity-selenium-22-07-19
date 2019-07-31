package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends PageObject {

    @FindBy(xpath="//li[@id='profile-nav-item']")
    WebElementFacade profileNavItem;

    public HomePage(WebDriver driver){
       super(driver);
    }

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(profileNavItem).waitUntilVisible();
    }
}
