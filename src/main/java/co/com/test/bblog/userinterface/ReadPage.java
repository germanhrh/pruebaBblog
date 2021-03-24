package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ReadPage extends PageObject {
    public static final Target ButtonReadTags = Target.the("where do we Validate and click ReadTags").located(By.xpath("//a[@class='tag-pill tag-default'][text()='Test']"));

}
