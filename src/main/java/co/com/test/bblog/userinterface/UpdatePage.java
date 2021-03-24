package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UpdatePage extends PageObject {

    public static final Target ButtonEditArticle = Target.the("where do we Validate and click EditArticle").located(By.xpath("//div[@class='banner']//a/i"));

}
