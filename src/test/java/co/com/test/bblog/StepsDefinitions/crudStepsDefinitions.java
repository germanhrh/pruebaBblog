package co.com.test.bblog.StepsDefinitions;

import co.com.test.bblog.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class crudStepsDefinitions {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that costumer open up bblog page$")
    public void thatCostumerOpenUpBblogPage() {
        OnStage.theActorCalled("Costumer").wasAbleTo(OpenUp.thePage(), Login.onThePage());

    }


    @When("^He Create a new Article$")
    public void heCreateANewArticle() {
        OnStage.theActorCalled("Costumer").wasAbleTo(Create.Article());
    }


    @When("^He Update an Article$")
    public void heUpdateAnArticle() {
        OnStage.theActorCalled("Costumer").wasAbleTo(Update.Article());
    }

    @When("^He Delete an Article$")
    public void heDeleteAnArticle() {
        OnStage.theActorCalled("Costumer").wasAbleTo(Delete.Article());
    }

    @When("^He Read an Article$")
    public void heReadAnArticle() {
        OnStage.theActorCalled("Costumer").wasAbleTo(Read.Article());
    }

    @Then("^logut$")
    public void logut() {
        OnStage.theActorCalled("Costumer").wasAbleTo(LogOut.Page());
    }
}
