package design.policymode.second;

/**
 * @author houzm
 *	鸭子超类
 *	需求：模拟鸭子游戏，各种鸭子，戏水，呱呱叫
 *	新需求：所有的鸭子要会飞
 *	新实现：为了让所有的鸭子都能飞，所以在超类中定义飞
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
	
	public void fly(){
		System.out.println("鸭子====飞");
	}
}
