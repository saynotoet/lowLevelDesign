package com.low.level.design.design.pattern.observer.model.pull;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    List<WeatherObserver> observerList;
    WeatherData weatherData;

    public WeatherStation(){
        this.observerList=new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setWeatherReadings(int temp, int humidity) {
        this.weatherData.temp=temp;
        this.weatherData.humidity=humidity;
        notifyObserver();
    }
}
