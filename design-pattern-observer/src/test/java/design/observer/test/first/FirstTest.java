/**
 * 
 */
package design.observer.test.first;

import design.observer.first.CurrentConditionsDisplay;
import design.observer.first.MySelfDisplay;
import design.observer.first.Subject;
import design.observer.first.WeatherData;

/**
 * 
 * @author hzm_dream_history@163.com
 * @date 2017年8月10日 下午3:10:22
 */
public class FirstTest {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		MySelfDisplay md = new MySelfDisplay(wd);
		
		wd.setMeasurements(10.0F, 10.0F, 10.0F);
		
	}
}
