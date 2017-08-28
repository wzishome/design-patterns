package design.observer.second;

import java.util.Observable;

/**
 * @author asus
 *	jdk自带的观察者模式实现类
 */
public class WeatherData extends Observable{
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged(){
		setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	};
	
	public float getTemp() {
		return temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	
}
