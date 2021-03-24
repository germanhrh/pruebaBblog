package co.com.test.bblog.task;

import co.com.test.bblog.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues("germanhrh@gmail.co").into(LoginPage.ImputUser),
                Enter.keyValues("qa-is-cool").into(LoginPage.ImputPass),
                Click.on(LoginPage.ButtonSub)

                //Enter.theValue("germanhrh@gmail.com").into(Login)
        );
    }
}
