package com.weatherapp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity

public class Coord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float lon;
    private float lat;
    @OneToOne(mappedBy = "coord")
    private Forecast forecast;

    public Coord (){}

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "id=" + id +
                ", lon=" + lon +
                ", lat=" + lat +
                ", forecast=" + forecast +
                '}';
    }
}
