package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yly on 2018/11/18.
 */

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_id")
        public String info;
    }
}
