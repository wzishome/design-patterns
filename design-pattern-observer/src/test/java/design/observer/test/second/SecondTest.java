package design.observer.test.second;

import design.observer.second.MySelfDisplay;
import design.observer.second.WeatherData;

public class SecondTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		MySelfDisplay mySelfDisplay = new MySelfDisplay(weatherData);
		weatherData.setMeasurements(10, 11, 12);
	}
}
