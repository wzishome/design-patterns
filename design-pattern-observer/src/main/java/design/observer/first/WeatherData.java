package design.observer.first;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	/**
	 * 天气主题 --观察者注册
	 * @auther hzm_dream_history@163.com
	 * @param observer
	 * @see design.observer.first.Subject#registerObserver(design.observer.first.Observer)
	 */
	public void registerObserver(Observer observer) {
		System.out.println("---------注册-------");
		observers.add(observer);
	}

	/**
	 * 天气主题--注销注册
	 * @auther hzm_dream_history@163.com
	 * @param observer
	 * @see design.observer.first.Subject#removeObserver(design.observer.first.Observer)
	 */
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index!=0) {
			observers.remove(index);
		}
	}

	/**
	 * 发布通知 给所有观察者
	 * @auther hzm_dream_history@163.com
	 * @see design.observer.first.Subject#notifyObservers()
	 */
	public void notifyObservers() {
		System.out.println("----------notifyObservers-------------");
		System.out.println("----------observers.size()-------------"+observers.size());
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		this.notifyObservers();
	};
	
	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	};

}
