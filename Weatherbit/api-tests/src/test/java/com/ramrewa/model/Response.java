
package com.ramrewa.app;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {
  private List <Datum> data = null;
  private String cityName;
  private String lon;
  private String timezone;
  private String lat;
  private String countryCode;
  private String stateCode;
}
