package com.weatherapp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="forecast")
public class Forecast {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "forecast_id")
    private Long forecast_id;
    private Date date;
    private int id;
    private int Timezone;
    private String name;
    private int cod;
    private int Visibility;
    private String base;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Coord coord;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Weather  weather;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private main main;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Wind wind;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Clouds clouds;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Sys sys;



    public Forecast(){}

    public Long getForecast_id() {
        return forecast_id;
    }

    public void setForecast_id(Long forecast_id) {
        this.forecast_id = forecast_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }


    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather[0];
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public main getMain() {
        return main;
    }

    public void setMain(main main) {
        this.main = main;
    }

    public int getVisibility() {
        return Visibility;
    }

    public void setVisibility(int visibility) {
        Visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return Timezone;
    }

    public void setTimezone(int timezone) {
        Timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecast_id=" + forecast_id +
                ", date=" + date +
                ", id=" + id +
                ", Timezone=" + Timezone +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                ", Visibility=" + Visibility +
                ", base='" + base + '\'' +
                '}';
    }
}
