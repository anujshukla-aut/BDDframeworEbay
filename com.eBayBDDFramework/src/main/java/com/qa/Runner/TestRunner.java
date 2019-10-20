package com.qa.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Pankaj\\eclipse-workspace\\com.eBayBDDFramework\\src"
				+ "\\main\\java\\com\\qa\\features\\eBay.feature", 
		glue={"com//qa//stepDefinations"},
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
				monochrome = true, 
				strict = true, 
				dryRun = true  )
		
public class TestRunner {

	}
