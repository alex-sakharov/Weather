package com.example.lexa.owm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ForecastData {

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private int message;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("cnt")
    @Expose
    private int cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cod", cod).append("message", message).append("city", city).append("cnt", cnt).append("list", list).toString();
    }

}