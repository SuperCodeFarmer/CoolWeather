package com.example.coolweather.gson;

/**
 * Created by yly on 2018/11/18.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
