package com.weatherapp.weather.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;

@Entity
public class Clouds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "AllClouds")
    private Long all;

    @OneToOne(mappedBy = "coord")
    private Forecast forecast;


    public  Clouds(){}

    public Long getAll() {
        return all;
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

    public void setAll(Long all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "id=" + id +
                ", all=" + all +
                ", forecast=" + forecast +
                '}';
    }
}
