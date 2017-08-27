package design.observer.first;

public interface Subject {

	/**
	 * 观察者注册
	 * @param observer
	 */
	void registerObserver(Observer observer);
	/**
	 * 观察者注销
	 * @param observer
	 */
	void removeObserver(Observer observer);
	/**
	 * 通知所有观察者
	 */
	void notifyObservers();
	
	
}
