package com.ramrewa.utils;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "json:target/cucumber-json/cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
    glue = {"com.ramrewa.weather.steps"},
    features = {"src/test/resources/Weather.feature"}
)
public class Runner {

}

