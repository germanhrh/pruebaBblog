package co.com.test.bblog.questions;

import co.com.test.bblog.userinterface.CreatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ArticlePublishedOK implements Question<String> {

    public static Question<String> value()
    {
        return new ArticlePublishedOK();
    }

    @Override
    public String answeredBy(Actor actor) {
        return CreatePage.ValidateContentArticleTitleArticle.resolveFor(actor).getText();
    }
}
