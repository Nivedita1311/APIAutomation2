package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/resources/features"},
        glue = {"src/test/java/stepdefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber"}
)

public class testRunner extends AbstractTestNGCucumberTests {


}

