package design.policymode.first;

/**
 * @author houzm
 *	鸭子超类
 *	需求：模拟鸭子游戏，各种鸭子，戏水，呱呱叫，
 */
public abstract class Duck {

	/**
	 * 因为鸭子的外观是具体的鸭子定义的，所以定义为抽象方法
	 */
	public abstract void display();
	
	public void quack(){
		System.out.println("鸭子====呱呱叫");
	}
	
	public void swim(){
		System.out.println("鸭子====戏水");
	}
	
}
