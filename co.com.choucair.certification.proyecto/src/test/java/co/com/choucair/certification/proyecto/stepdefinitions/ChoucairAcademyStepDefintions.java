package co.com.choucair.certification.proyecto.stepdefinitions;

import co.com.choucair.certification.proyecto.model.AcademychoucairData;
import co.com.choucair.certification.proyecto.questions.Answers1;
import co.com.choucair.certification.proyecto.tasks.Login;
import co.com.choucair.certification.proyecto.tasks.OpenUp;
import co.com.choucair.certification.proyecto.tasks.Search1;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import org.mockito.Answers;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Answer1;

import java.util.List;

import static org.fluentlenium.core.search.Search.*;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage () {OnStage.setTheStage(new OnlineCast()); }


    @Given("^Than brandon wnats tolearn automation at the academy Choucair$")
    public void thanBrandonWnatsTolearnAutomationAtTheAcademyChoucair(List<AcademychoucairData> academychoucairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.onThePage());

    }

    @When("^He search for the course (.*) recursos automation Bancolombia on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomationBancolombiaOnTheChoucairAcademyPlatform(List<AcademychoucairData> academychoucairData) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search1.the(academychoucairData.get(0).getStrCourse()));

    }

    @Then("^He finds the course called resources recursos (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomationBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answers1.toThe(question)));
    }


}
