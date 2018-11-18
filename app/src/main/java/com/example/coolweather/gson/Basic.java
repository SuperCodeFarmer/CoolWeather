package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yly on 2018/11/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
