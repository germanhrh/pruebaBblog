package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DeletePage extends PageObject {

    public static final Target ButtonDeleteArticle = Target.the("where do we Validate and click DeleteArticle").located(By.xpath("//div[@class='banner']//button[contains(text(),'Delete Article')]"));

}
