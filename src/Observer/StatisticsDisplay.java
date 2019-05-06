package Observer;

/**
 * This class will display the minimal, maximal of temperature, humidity and pressure
 * */
public class StatisticsDisplay implements Observer, Display{

    int updateCount;
    float temp;
    float humidity;
    float pressure;
    Subject weatherData;

    StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        updateCount = 0;
        temp = 0;
        humidity = 0;
        pressure = 0;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        updateCount++;
        this.temp += temp;
        this.temp /= updateCount;
        this.humidity += humidity;
        this.humidity /= updateCount;
        this.pressure += pressure;
        this.pressure /= updateCount;
        display();
    }

    @Override
    public void display() {
        System.out.println("statistics display:  avg temperature: " +
                String.format("%.2f", temp) + ", humidity: " + String.format("%.2f", humidity) + ", pressure: " + String.format("%.2f", pressure));
    }
}
