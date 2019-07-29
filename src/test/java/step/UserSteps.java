package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page.LandingPage;

public class UserSteps extends ScenarioSteps {

    LandingPage landingPage;

    @Step
    public void openLandingPage() {
        landingPage.open();
    }
}

