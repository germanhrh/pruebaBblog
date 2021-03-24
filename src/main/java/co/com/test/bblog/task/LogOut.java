package co.com.test.bblog.task;

import co.com.test.bblog.userinterface.LogOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogOut implements Task {

    public static LogOut Page() {
        return Tasks.instrumented(LogOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogOutPage.ButtonSettings),
                WaitUntil.the(LogOutPage.ButtonLogOut, isVisible()),
                Click.on(LogOutPage.ButtonLogOut)

                );
    }
}
