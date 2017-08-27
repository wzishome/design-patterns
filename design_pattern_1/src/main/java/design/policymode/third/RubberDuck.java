package design.policymode.third;

/**
 * @author houzm
 *	木头鸭类
 *	因为不会飞：所以我们要覆写超类的fly方法
 *	因为不会呱呱叫：所以要覆写超类的quack方法
 */
public class RubberDuck extends Duck implements Flyable,Quackable{

	@Override
	public void display() {
		System.out.println("木头鸭子===外观是木头头");
	}

	public void fly() {
		System.out.println("木头鸭子===不会飞");
	}

	public void quack() {
		System.out.println("木头鸭子===吱吱叫");
	}
}
