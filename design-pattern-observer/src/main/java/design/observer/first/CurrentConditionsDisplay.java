/**
 * 
 */
package design.observer.first;

/**
 * 布告板
 * @author hzm_dream_history@163.com
 * @date 2017年8月10日 下午3:04:50
 */
public class CurrentConditionsDisplay implements Observer {
	
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/**
	 * 更新数据
	 * @auther hzm_dream_history@163.com
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 压力
	 * @see design.observer.first.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	/**
	 * 发布通告
	 */
	private void display() {
		System.out.println("CurrentConditionsDisplay [temp=" + temp + ", humidity="
				+ humidity + ", pressure=" + pressure + "]"); 
	}

	

}
