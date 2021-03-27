
package com.ramrewa.app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

  @SerializedName("valid_date")
  @Expose
  private String validDate;
  @SerializedName("ts")
  @Expose
  private Integer ts;
  @SerializedName("datetime")
  @Expose
  private String datetime;
  @SerializedName("wind_gust_spd")
  @Expose
  private Double windGustSpd;
  @SerializedName("wind_spd")
  @Expose
  private Double windSpd;
  @SerializedName("wind_dir")
  @Expose
  private Integer windDir;
  @SerializedName("wind_cdir")
  @Expose
  private String windCdir;
  @SerializedName("wind_cdir_full")
  @Expose
  private String windCdirFull;
  @SerializedName("temp")
  @Expose
  private Integer temp;
  @SerializedName("max_temp")
  @Expose
  private Integer maxTemp;
  @SerializedName("min_temp")
  @Expose
  private Integer minTemp;
  @SerializedName("high_temp")
  @Expose
  private Integer highTemp;
  @SerializedName("low_temp")
  @Expose
  private Double lowTemp;
  @SerializedName("app_max_temp")
  @Expose
  private Double appMaxTemp;
  @SerializedName("app_min_temp")
  @Expose
  private Double appMinTemp;
  @SerializedName("pop")
  @Expose
  private Integer pop;
  @SerializedName("precip")
  @Expose
  private Integer precip;
  @SerializedName("snow")
  @Expose
  private Integer snow;
  @SerializedName("snow_depth")
  @Expose
  private Integer snowDepth;
  @SerializedName("slp")
  @Expose
  private Integer slp;
  @SerializedName("pres")
  @Expose
  private Double pres;
  @SerializedName("dewpt")
  @Expose
  private Double dewpt;
  @SerializedName("rh")
  @Expose
  private Double rh;
  @SerializedName("weather")
  @Expose
  private Weather weather;
  @SerializedName("pod")
  @Expose
  private String pod;
  @SerializedName("clouds_low")
  @Expose
  private Integer cloudsLow;
  @SerializedName("clouds_mid")
  @Expose
  private Integer cloudsMid;
  @SerializedName("clouds_hi")
  @Expose
  private Integer cloudsHi;
  @SerializedName("clouds")
  @Expose
  private Integer clouds;
  @SerializedName("vis")
  @Expose
  private Integer vis;
  @SerializedName("max_dhi")
  @Expose
  private Integer maxDhi;
  @SerializedName("uv")
  @Expose
  private Integer uv;
  @SerializedName("moon_phase")
  @Expose
  private Double moonPhase;
  @SerializedName("moon_phase_lunation")
  @Expose
  private Double moonPhaseLunation;
  @SerializedName("moonrise_ts")
  @Expose
  private Integer moonriseTs;
  @SerializedName("moonset_ts")
  @Expose
  private Integer moonsetTs;
  @SerializedName("sunrise_ts")
  @Expose
  private Integer sunriseTs;
  @SerializedName("sunset_ts")
  @Expose
  private Integer sunsetTs;

  public String getValidDate() {
    return validDate;
  }

  public void setValidDate(String validDate) {
    this.validDate = validDate;
  }

  public Integer getTs() {
    return ts;
  }

  public void setTs(Integer ts) {
    this.ts = ts;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public Double getWindGustSpd() {
    return windGustSpd;
  }

  public void setWindGustSpd(Double windGustSpd) {
    this.windGustSpd = windGustSpd;
  }

  public Double getWindSpd() {
    return windSpd;
  }

  public void setWindSpd(Double windSpd) {
    this.windSpd = windSpd;
  }

  public Integer getWindDir() {
    return windDir;
  }

  public void setWindDir(Integer windDir) {
    this.windDir = windDir;
  }

  public String getWindCdir() {
    return windCdir;
  }

  public void setWindCdir(String windCdir) {
    this.windCdir = windCdir;
  }

  public String getWindCdirFull() {
    return windCdirFull;
  }

  public void setWindCdirFull(String windCdirFull) {
    this.windCdirFull = windCdirFull;
  }

  public Integer getTemp() {
    return temp;
  }

  public void setTemp(Integer temp) {
    this.temp = temp;
  }

  public Integer getMaxTemp() {
    return maxTemp;
  }

  public void setMaxTemp(Integer maxTemp) {
    this.maxTemp = maxTemp;
  }

  public Integer getMinTemp() {
    return minTemp;
  }

  public void setMinTemp(Integer minTemp) {
    this.minTemp = minTemp;
  }

  public Integer getHighTemp() {
    return highTemp;
  }

  public void setHighTemp(Integer highTemp) {
    this.highTemp = highTemp;
  }

  public Double getLowTemp() {
    return lowTemp;
  }

  public void setLowTemp(Double lowTemp) {
    this.lowTemp = lowTemp;
  }

  public Double getAppMaxTemp() {
    return appMaxTemp;
  }

  public void setAppMaxTemp(Double appMaxTemp) {
    this.appMaxTemp = appMaxTemp;
  }

  public Double getAppMinTemp() {
    return appMinTemp;
  }

  public void setAppMinTemp(Double appMinTemp) {
    this.appMinTemp = appMinTemp;
  }

  public Integer getPop() {
    return pop;
  }

  public void setPop(Integer pop) {
    this.pop = pop;
  }

  public Integer getPrecip() {
    return precip;
  }

  public void setPrecip(Integer precip) {
    this.precip = precip;
  }

  public Integer getSnow() {
    return snow;
  }

  public void setSnow(Integer snow) {
    this.snow = snow;
  }

  public Integer getSnowDepth() {
    return snowDepth;
  }

  public void setSnowDepth(Integer snowDepth) {
    this.snowDepth = snowDepth;
  }

  public Integer getSlp() {
    return slp;
  }

  public void setSlp(Integer slp) {
    this.slp = slp;
  }

  public Double getPres() {
    return pres;
  }

  public void setPres(Double pres) {
    this.pres = pres;
  }

  public Double getDewpt() {
    return dewpt;
  }

  public void setDewpt(Double dewpt) {
    this.dewpt = dewpt;
  }

  public Double getRh() {
    return rh;
  }

  public void setRh(Double rh) {
    this.rh = rh;
  }

  public Weather getWeather() {
    return weather;
  }

  public void setWeather(Weather weather) {
    this.weather = weather;
  }

  public String getPod() {
    return pod;
  }

  public void setPod(String pod) {
    this.pod = pod;
  }

  public Integer getCloudsLow() {
    return cloudsLow;
  }

  public void setCloudsLow(Integer cloudsLow) {
    this.cloudsLow = cloudsLow;
  }

  public Integer getCloudsMid() {
    return cloudsMid;
  }

  public void setCloudsMid(Integer cloudsMid) {
    this.cloudsMid = cloudsMid;
  }

  public Integer getCloudsHi() {
    return cloudsHi;
  }

  public void setCloudsHi(Integer cloudsHi) {
    this.cloudsHi = cloudsHi;
  }

  public Integer getClouds() {
    return clouds;
  }

  public void setClouds(Integer clouds) {
    this.clouds = clouds;
  }

  public Integer getVis() {
    return vis;
  }

  public void setVis(Integer vis) {
    this.vis = vis;
  }

  public Integer getMaxDhi() {
    return maxDhi;
  }

  public void setMaxDhi(Integer maxDhi) {
    this.maxDhi = maxDhi;
  }

  public Integer getUv() {
    return uv;
  }

  public void setUv(Integer uv) {
    this.uv = uv;
  }

  public Double getMoonPhase() {
    return moonPhase;
  }

  public void setMoonPhase(Double moonPhase) {
    this.moonPhase = moonPhase;
  }

  public Double getMoonPhaseLunation() {
    return moonPhaseLunation;
  }

  public void setMoonPhaseLunation(Double moonPhaseLunation) {
    this.moonPhaseLunation = moonPhaseLunation;
  }

  public Integer getMoonriseTs() {
    return moonriseTs;
  }

  public void setMoonriseTs(Integer moonriseTs) {
    this.moonriseTs = moonriseTs;
  }

  public Integer getMoonsetTs() {
    return moonsetTs;
  }

  public void setMoonsetTs(Integer moonsetTs) {
    this.moonsetTs = moonsetTs;
  }

  public Integer getSunriseTs() {
    return sunriseTs;
  }

  public void setSunriseTs(Integer sunriseTs) {
    this.sunriseTs = sunriseTs;
  }

  public Integer getSunsetTs() {
    return sunsetTs;
  }

  public void setSunsetTs(Integer sunsetTs) {
    this.sunsetTs = sunsetTs;
  }

}
