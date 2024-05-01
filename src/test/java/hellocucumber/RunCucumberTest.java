package hellocucumber;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages({"parallel", "hellocucumber"})
@ExcludeTags("disabled")
@IncludeTags("tag")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-reports/report.html")
@ConfigurationParameter(key = PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME, value = "true")
public class RunCucumberTest {
}
