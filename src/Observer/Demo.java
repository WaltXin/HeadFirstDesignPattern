package Observer;

public class Demo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setWeatherData(20.2f, 42.2f, 15.0f);
        weatherData.setWeatherData(10.2f, 21.2f, 15.0f);
    }
}
