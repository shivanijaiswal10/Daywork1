package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\cucumber\\src\\test\\resources\\eBayFeatures\\search.feature",
		glue = "Steps"
		)


public class TestRunner {


}
