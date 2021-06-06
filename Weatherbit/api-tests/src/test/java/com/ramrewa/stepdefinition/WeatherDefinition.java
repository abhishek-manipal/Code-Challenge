package com.ramrewa.stepdefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class WeatherDefinition {
  @Given("I like to holiday in Sydney")
  public void iLikeToSurfInSydney() throws Throwable {
    System.out.println("I like to holiday in Sydney");
  }

  @And("I only like to holiday on Thursdays")
  public void ILikeToHolidayOnThursdays() throws Throwable {
    System.out.println("I only like to holiday on Thursdays!");
  }

  @When("I look up the weather forecast")
  public void ILookupWeatherForecast() throws Throwable {
    System.out.println("I look up the weather forecast");
  }

  @Then("I receive the weather forecast")
  public void IReceiveWeatherForecast() throws Throwable {
    System.out.println("I receive the weather forecast");
  }

  @And("the temperature is warmer than 10 degrees")
  public void TheTemperatureIsWarmerThan10Degrees() throws Throwable {
    System.out.println("the temperature is warmer than 10 degrees");
  }
}
