package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { "json:target/cucumber.json" }, // report = main in json format {}
		features = { "./src/test/resources/Online Banking Login.feature" }, // feature file location/path
		glue = { "com.generic" }, // step def package name
		tags = "@Smoke" // test type= @Smoke

)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
