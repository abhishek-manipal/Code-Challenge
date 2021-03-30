package com.ramrewa.stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class WeatherDefinition {
  WeatherForecast weatherForecast = new WeatherForecast();
  String tripLocation;

  @Given("^I like to holiday in (.*)$")
  public void iLikeToHolidayInSydney(String locationOfTrip) {

  }


}
