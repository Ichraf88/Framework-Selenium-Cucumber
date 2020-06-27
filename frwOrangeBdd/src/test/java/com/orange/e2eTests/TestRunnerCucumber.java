package com.orange.e2eTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = ("pretty"),
		features = {"src/spec/features"}
		,
		//glue={""},
		plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Orange_Report.html"},
		snippets = SnippetType.CAMELCASE,
		tags= {("@cnx")},

		monochrome = true
		)

public class TestRunnerCucumber {

	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));

	}
}