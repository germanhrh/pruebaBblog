package co.com.test.bblog.task;

import co.com.test.bblog.userinterface.ReadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Read implements Task {
    public static Read Article() {
        return Tasks.instrumented(Read.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReadPage.ButtonReadTags)
                );
    }
}
