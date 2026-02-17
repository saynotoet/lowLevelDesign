package com.low.level.design.design.pattern.observer.model.pull;

public class ForecastConditionsDisplay implements WeatherObserver {
    private final WeatherObservable weatherStation; // this object can bbe used to update data and do other stuff.

    public ForecastConditionsDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        //custom logic
    }
}
