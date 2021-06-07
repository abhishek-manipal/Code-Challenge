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
//import com.fasterxml.jackson.databind.ObjectMapper;





public class WeatherHelper {
  private final static Logger logger = Logger.getLogger("WeatherHelper.class");
  public static final String endPoint = "https://openweathermap.org/forecast16";
  public static final String api_key="48bb89e113f9a204239ebeede53b4f81";
  public static final String city = "sydney";
  public static final String country_Code =  "au";
  public static final String url_with_city_country  = endPoint+"/data/2.5/weather?q=" + city + "," + country_Code + "&APPID=" + api_key;

  //ObjectMapper mapper = new ObjectMapper();
  Map<String, String> mapWebserviceResponse;
  //mapWebserviceResponse = invocationUtil.invokePostWithHeaders(endPoint, query, headerListRewards);
  String responseStr = mapWebserviceResponse.get("response");
  //return mapper.readValue(responseStr, AppleWalletResponse.class);

}



