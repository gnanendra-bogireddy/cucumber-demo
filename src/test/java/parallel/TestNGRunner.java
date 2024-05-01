package parallel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(dryRun = true, publish = true,
        plugin = {"pretty","html:target/cucumber-reports/report.html", "json:target/cucumber-reports/report.json"},
        tags = "@tag", features = {"src\\test\\resources\\hellocucumber\\example.feature", "src\\test\\resources\\parallel\\scenarios.feature"},
        glue = {"hellocucumber", "parallel", "hooks"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}