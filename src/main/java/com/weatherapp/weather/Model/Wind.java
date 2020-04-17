package com.weatherapp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Wind {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float speed;
    private float deg;
    @OneToOne(mappedBy = "coord")
    private Forecast forecast;

    public Wind (){}


    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
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
        return "Wind{" +
                "id=" + id +
                ", speed=" + speed +
                ", deg=" + deg +
                ", forecast=" + forecast +
                '}';
    }
}
