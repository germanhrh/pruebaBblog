package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static final Target ImputUser = Target.the("where do we Imput User").located(By.xpath("//input[contains(@placeholder,'Username')]"));
    public static final Target ImputPass = Target.the("where do we Imput Pass").located(By.xpath("//input[contains(@placeholder,'Password')]"));
    public static final Target ButtonSub = Target.the("where do we Validate and click Sub").located(By.xpath("//*[contains(@type,'submit')]"));

}
