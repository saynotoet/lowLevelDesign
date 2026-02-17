package com.low.level.design.design.pattern.observer.model.push;

public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
    void setWeatherReadings(int temp, int humidity);

}
