package design.policymode.third;

/**
 * @author houzm
 *	鸭子超类
 *	需求：模拟鸭子游戏，各种鸭子，戏水，呱呱叫
 *	新需求：抽取不变的定义为超类，进行代码重用。
 *			抽取变得定义为接口
 */
public abstract class Duck {
	/**
	 * 因为鸭子的外观是具体的鸭子定义的，所以定义为抽象方法
	 */
	public abstract void display();
	
	
}
