package com.example.lexa.owm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class List {

    @SerializedName("dt")
    @Expose
    private int dt;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("pressure")
    @Expose
    private float pressure;
    @SerializedName("humidity")
    @Expose
    private int humidity;
    @SerializedName("weather")
    @Expose
    private java.util.List<Weather> weather = null;
    @SerializedName("speed")
    @Expose
    private float speed;
    @SerializedName("deg")
    @Expose
    private int deg;
    @SerializedName("clouds")
    @Expose
    private int clouds;
    @SerializedName("snow")
    @Expose
    private float snow;

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public float getSnow() {
        return snow;
    }

    public void setSnow(float snow) {
        this.snow = snow;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dt", dt).append("temp", temp).append("pressure", pressure).append("humidity", humidity).append("weather", weather).append("speed", speed).append("deg", deg).append("clouds", clouds).append("snow", snow).toString();
    }

}