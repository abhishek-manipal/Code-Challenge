package com.ramrewa.helper;

import com.ramrewa.model.Response;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WeatherHelper {
  private final static Logger logger = Logger.getLogger("WeatherHelper.class");
  public static final String endPoint = "https://openweathermap.org/forecast16";
  public static final String api_key="48bb89e113f9a204239ebeede53b4f81";
  public static final String city = "sydney";
  public static final String country_Code =  "au";
  public static final String url_with_city_country  = endPoint+"/data/2.5/weather?q=" + city + "," + country_Code + "&APPID=" + api_key;


  //api.openweathermap.org/data/2.5/weather?id=2172797&appid={API key}

}



