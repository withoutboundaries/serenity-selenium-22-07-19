package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.matchers.BeanMatcher;
import static net.thucydides.core.matchers.BeanMatcherAsserts.shouldMatch;
import net.thucydides.core.steps.ScenarioSteps;
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
    public void shouldBeLoggedIn(BeanMatcher... matchers){
        shouldMatch(homePage().getTitle(), matchers);
    }

    private LandingPage landingPage() {
        return getPages().get(LandingPage.class);
    }

    private HomePage homePage() {
        return getPages().get(HomePage.class);
    }
}

