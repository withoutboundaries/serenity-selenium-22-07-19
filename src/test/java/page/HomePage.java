package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends PageObject {
    private List<String> titles;

    @FindBy(xpath="//li[@id='profile-nav-item']")
    WebElementFacade profileNavItem;

    public HomePage(WebDriver driver){
       super(driver);
       titles.add(driver.getTitle());
    }

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(profileNavItem).waitUntilVisible();
    }

    public String getTitle() {
        return titles.get(0);
    }
}
