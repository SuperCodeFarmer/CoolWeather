package com.example.coolweather.gson;

import android.view.LayoutInflater;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yly on 2018/11/18.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CardWash cardWash;

    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CardWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
