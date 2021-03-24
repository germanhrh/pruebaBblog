package co.com.test.bblog.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreatePage extends PageObject {

    public static final Target ButtonNewPost = Target.the("where do we Validate and click NewPost").located(By.xpath("//a[contains(text(),'New Post')]"));
    public static final Target ImputTitleArticle = Target.the("where do we Imput TitleArticle").located(By.xpath("//input[contains(@placeholder,'Article Title')]"));
    public static final Target ImputAboutArticle = Target.the("where do we Imput AboutArticle").located(By.xpath("//input[contains(@placeholder,'this article about')]"));
    public static final Target ImputArticle = Target.the("where do we Imput Article").located(By.xpath("//textarea[contains(@placeholder,'Write your article')]"));
    public static final Target ImputTags = Target.the("where do we Imput Tags").located(By.xpath("//input[contains(@placeholder,'Tags')]"));
    public static final Target ButtonPublish = Target.the("where do we Validate and click Publish").located(By.xpath("//button[contains(text(),'Publish Article')]"));
    public static final Target ValidateContentArticleTitleArticle = Target.the("where do we Validate ContentArticleTitleArticle").located(By.xpath("//div[@class='article-page']//h1"));

}
