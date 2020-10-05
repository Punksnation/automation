package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Administrator\\Documents\\BetwayJava\\src\\test\\java\\feature_file\\login.feature",
        glue = "module",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output"}
)
public class testRunner {
}
