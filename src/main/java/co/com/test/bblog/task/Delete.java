package co.com.test.bblog.task;

import co.com.test.bblog.userinterface.DeletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Delete implements Task {
    public static Delete Article() {
        return Tasks.instrumented(Delete.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DeletePage.ButtonDeleteArticle)
                );
    }
}
