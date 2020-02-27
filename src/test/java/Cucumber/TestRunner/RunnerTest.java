package Cucumber.TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/Cucumber/",
        glue = "",
        strict = true
        )

public class RunnerTest {
}
