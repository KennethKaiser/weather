package com.weatherapp.weather.Repository;

import com.weatherapp.weather.Model.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForecastRepo extends JpaRepository<Forecast, Long> {


}
