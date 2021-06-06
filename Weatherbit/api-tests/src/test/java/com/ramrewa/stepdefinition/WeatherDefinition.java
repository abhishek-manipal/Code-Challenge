package com.ramrewa.stepdefinition;

import com.ramrewa.model.Response;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.logging.Logger;

public class WeatherDefinition extends Response {

  private final Logger logger = Logger.getLogger("WeatherDefinition.class");

  @Given("I like to holiday in Sydney")
  public void iLikeToSurfInSydney() throws Throwable {

    //private WeatherResponse Response;
    logger.info("I like to holiday in Sydney ");;
  }

  @And("I only like to holiday on Thursdays")
  public void ILikeToHolidayOnThursdays() throws Throwable {
    logger.info("I only like to holiday on Thursdays!");
  }

  @When("I look up the weather forecast")
  public void ILookupWeatherForecast() throws Throwable {
    logger.info("I look up the weather forecast");
  }

  @Then("I receive the weather forecast")
  public void IReceiveWeatherForecast() throws Throwable {
    logger.info("I receive the weather forecast");
  }

  @And("the temperature is warmer than 10 degrees")
  public void TheTemperatureIsWarmerThan10Degrees() throws Throwable {
    logger.info("the temperature is warmer than 10 degrees");
  }
}
