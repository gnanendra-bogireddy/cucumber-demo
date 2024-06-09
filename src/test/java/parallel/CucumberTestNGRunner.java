package parallel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(dryRun = true, publish = true,
        plugin = {
                "pretty",
//                "message",
//                "progress",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/report.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "testng:target/cucumber-reports/testng.xml",
                "junit:target/cucumber-reports/junit.xml",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
//        tags = "@tag",
        features = {"classpath:parallel"},
        glue = {"hellocucumber", "parallel"})
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}