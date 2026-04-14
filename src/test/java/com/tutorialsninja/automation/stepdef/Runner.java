package com.tutorialsninja.automation.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features=
{"src/test/resources/FeatureFiles/Search.feature",
"src/test/resources/FeatureFiles/Login.feature",
"src/test/resources/FeatureFiles/Register.feature"},
glue="com.tutorialsninja.automation.stepdef",
plugin={"pretty","html:target/cucumber-report.html"},
tags="@Search"
)

public class Runner {
}