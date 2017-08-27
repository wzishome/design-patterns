package design.policymode.forth.unchange;

import design.policymode.forth.change.FlyBehavior;
import design.policymode.forth.change.QuackBehavior;

/**
 * @author houzm
 *	鸭子超类
 *	需求：模拟鸭子游戏，各种鸭子，戏水，呱呱叫
 *	新需求：抽取不变的定义为超类，进行代码重用。
 *			抽取变得定义为接口
 */
/**
 * @author houzm
 *
 */
public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	/**
	 * 因为鸭子的外观是具体的鸭子定义的，所以定义为抽象方法
	 */
	public abstract void display();
	/**
	 * 游泳
	 */
	public void swim(){
		System.out.println("所有鸭子都会游泳，属于不变的部分");
	}
	/**
	 * 叫
	 */
	public void perFormQuack(){
		quackBehavior.quack();
	}
	
	/**
	 * 飞
	 */
	public void perFormFly(){
		flyBehavior.fly();
	}
	
	/**
	 * @param flyBehavior
	 * 动态设置鸭子如何飞
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	
	
	/**
	 * @param quackBehavior
	 * 动态设置鸭子如何叫
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}
