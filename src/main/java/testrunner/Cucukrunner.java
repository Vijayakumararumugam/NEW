package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features ="src/main/java/createLead/createleads.feature", glue = {"methoddeclarionforcumcuber", "hooks"}, monochrome = true,
tags="@smoke")

public class Cucukrunner {

}
