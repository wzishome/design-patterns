package design.policymode.third;

/**
 * @author houzm
 *	红头类
 */
public class RedHeadDuck extends Duck implements Flyable,Quackable{

	@Override
	public void display() {
		System.out.println("红头鸭子===外观是红头");
	}

	public void fly() {
		System.out.println("红头鸭子===用翅膀飞");
	}

	public void quack() {
		System.out.println("红头鸭子===呱呱叫");
	}

}
