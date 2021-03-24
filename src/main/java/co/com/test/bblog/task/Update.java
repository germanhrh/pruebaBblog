package co.com.test.bblog.task;

import co.com.test.bblog.userinterface.CreatePage;
import co.com.test.bblog.userinterface.UpdatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Update implements Task {
    public static Update Article() {
        return Tasks.instrumented(Update.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UpdatePage.ButtonEditArticle),
                WaitUntil.the(CreatePage.ImputArticle, isVisible()),
                Enter.keyValues("Test CRUD Update").into(CreatePage.ImputArticle),
                Click.on(CreatePage.ButtonPublish)
                );
    }
}
