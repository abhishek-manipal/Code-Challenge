
package com.ramrewa.model;

import java.util.List;
import com.ramrewa.model.*;
import lombok.Data;

@Data
public class Response {
  private List <DataWeather> data = null;
  private String cityName;
  private String lon;
  private String timezone;
  private String lat;
  private String countryCode;
  private String stateCode;
}
