package runner;

import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

/**
 *
 * @author  aasrir
 * @since   2017-05
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"pretty", "json:target/JSON/TestResults.json"},
        features = {"src/test/java/features"},
        glue = {""},
        tags = {}
)
public class RunCukesTest {
}
