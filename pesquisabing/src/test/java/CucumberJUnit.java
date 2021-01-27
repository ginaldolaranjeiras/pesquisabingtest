import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/main/resources"},
        plugin = {"pretty", "json:target/cucumber-reports/CucumberTestReport.json"}
)

public class CucumberJUnit {

}
