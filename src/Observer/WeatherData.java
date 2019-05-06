package Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    Set<Observer> registerList;
    float temp;
    float humidity;
    float pressure;

    WeatherData() {
        registerList = new HashSet<>();
        temp = 0;
        humidity = 0;
        pressure = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        registerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (registerList.contains(o)) {
            registerList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer curr : registerList) {
            curr.update(temp, humidity, pressure);
        }
    }

    public void setWeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
