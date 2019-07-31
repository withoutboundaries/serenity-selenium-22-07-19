package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import page.HomePage;
import page.LandingPage;

public class UserSteps extends ScenarioSteps {

    @Step
    public void openLandingPage() {
        landingPage().open();
    }

    @Step
    public void logIn(String userEmail, String userPassword){
        landingPage().loginWithValidCredentials(userEmail,userPassword);
    }

    @Step
    public void shouldBeLoggedIn(){
        Assert.assertTrue("Home page is not loaded", (homePage().getTitle()).contains("LinkedIn"));
    }

    private LandingPage landingPage() {
        return getPages().get(LandingPage.class);
    }

    private HomePage homePage() {
        return getPages().get(HomePage.class);
    }
}

