package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// As an Abstractor I shall be able to search for Amendment Trials for 2017
@CucumberOptions(
        plugin={"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features={"src/test/resources/features/browseToURL.feature","src/test/resources/features/amendmentTrials2017.feature"},
        glue={"com.example.Steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
