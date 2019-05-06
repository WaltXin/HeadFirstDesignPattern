package Observer;

/**
 * Concreate Observer
 * This class will display the current weather
 * */
public class CurrentConditionsDisplay implements Observer, Display{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("current conditions display:  temperature: " + temp + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
