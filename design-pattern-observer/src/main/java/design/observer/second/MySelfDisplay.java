package design.observer.second;

import java.util.Observable;
import java.util.Observer;

public class MySelfDisplay implements Observer {

	private float temp;
	private float humidity;
	private float pressure;
	private Observable obervable;
	
	
	
	public MySelfDisplay(Observable obervable) {
		this.obervable = obervable;
		obervable.addObserver(this);
	}


	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData wetherData = (WeatherData) o;
			this.temp = wetherData.getTemp();
			this.humidity = wetherData.getHumidity();
			this.pressure = wetherData.getPressure();
			display();
		}
	}
	
	/**
	 * 发布通告
	 */
	private void display() {
		System.out.println("MySelfDisplay [temp=" + temp + ", humidity=" + humidity
				+ ", pressure=" + pressure+ "]");
	}
}
