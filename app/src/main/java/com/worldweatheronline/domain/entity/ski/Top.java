
package com.worldweatheronline.domain.entity.ski;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top {

    @SerializedName("tempC")
    @Expose
    public String tempC;
    @SerializedName("tempF")
    @Expose
    public String tempF;
    @SerializedName("weatherCode")
    @Expose
    public String weatherCode;
    @SerializedName("weatherDesc")
    @Expose
    public List<WeatherDesc__> weatherDesc = null;
    @SerializedName("weatherIconUrl")
    @Expose
    public List<WeatherIconUrl__> weatherIconUrl = null;
    @SerializedName("winddir16Point")
    @Expose
    public String winddir16Point;
    @SerializedName("winddirDegree")
    @Expose
    public String winddirDegree;
    @SerializedName("windspeedKmph")
    @Expose
    public String windspeedKmph;
    @SerializedName("windspeedMiles")
    @Expose
    public String windspeedMiles;

}
