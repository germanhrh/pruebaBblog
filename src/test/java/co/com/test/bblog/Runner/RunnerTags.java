package co.com.test.bblog.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/bblog.feature",
        tags = "@Crudbblog",
        glue ="co.com.test.bblog.StepsDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
