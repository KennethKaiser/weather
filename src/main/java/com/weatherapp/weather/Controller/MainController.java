package com.weatherapp.weather.Controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.weatherapp.weather.Model.Forecast;
import com.weatherapp.weather.Model.Sys;
import com.weatherapp.weather.Model.Weather;
import com.weatherapp.weather.Repository.ForecastRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    ForecastRepo forecastRepo;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public String forside(Model model)
    {


        List<Forecast> forecastList = forecastRepo.findAll();

        model.addAttribute("forecastList", forecastList);



        return "index";

    }

    @GetMapping("/ViewForecast/{forecast_id}")
    public String viewForecast(@PathVariable(name = "forecast_id") Long id, Model model){

        Forecast forecast = forecastRepo.findById(id).get();

        System.out.println(forecast);

        model.addAttribute("forecast", forecast);


        return "forecast";


    }

    @GetMapping("/DeleteForecast/{forecast_id}")
    public String deleteForecast(@PathVariable(name = "forecast_id") Long id){

        forecastRepo.deleteById(id);


        return "redirect:/";


    }


    @GetMapping("/newForecast")
    public String newForecast(){

        Forecast forecast = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=Copenhagen&appid=0d34129312c0849c4c44d12c38d1986e"
                , Forecast.class);

        forecast.setDate(new Date());
        System.out.println(forecast);
        forecastRepo.save(forecast);
        return "redirect:/";

    }



}
