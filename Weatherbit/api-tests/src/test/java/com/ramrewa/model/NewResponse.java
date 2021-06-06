
package com.ramrewa.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewResponse {

    private Coord coord;
    private List<Weather> weather = null;
    private String base;
    private MainTemp main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
