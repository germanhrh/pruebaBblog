package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LogOutPage extends PageObject {
    public static final Target ButtonSettings = Target.the("where do we Validate and click Settings").located(By.xpath("//a[@routerlink='/settings']"));
    public static final Target ButtonLogOut = Target.the("where do we Validate and click LogOut").located(By.xpath("//button[@class='btn btn-outline-danger']"));

}
