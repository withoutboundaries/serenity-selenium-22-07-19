package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.linkedin.com")
public class LandingPage extends PageObject {

    @FindBy(xpath = "//input[@name='session_key']")
    WebElementFacade userEmailField;

    @FindBy(xpath = "//input[@name='session_password']")
    WebElementFacade userPasswordField;

    @FindBy(xpath = "//button[@class='sign-in-form__submit-btn']")
    WebElementFacade signInBtn;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void loginWithValidCredentials(String userEmail, String userPassword) {
        typeInto(userEmailField, userEmail);
        typeInto(userPasswordField, userPassword);
        signInBtn.click();
    }

}