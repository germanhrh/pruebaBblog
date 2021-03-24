package co.com.test.bblog.task;

import co.com.test.bblog.questions.ArticlePublishedOK;
import co.com.test.bblog.userinterface.CreatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Create implements Task {

    public static Create Article() {
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreatePage.ButtonNewPost),
                Enter.keyValues("TestG").into(CreatePage.ImputTitleArticle),
                Enter.keyValues("Test").into(CreatePage.ImputAboutArticle),
                Enter.keyValues("Test CRUD").into(CreatePage.ImputArticle),
                Enter.keyValues("Test").into(CreatePage.ImputTags),
                Click.on(CreatePage.ButtonPublish)
                );
        actor.should(seeThat("Displayed ", ArticlePublishedOK.value(), equalTo("TestG"))
        );
    }
}
