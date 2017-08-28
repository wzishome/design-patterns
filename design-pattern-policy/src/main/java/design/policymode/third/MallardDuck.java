package design.policymode.third;

/**
 * @author houzm
 *	野鸭类
 */
public class MallardDuck extends Duck implements Flyable,Quackable {

	@Override
	public void display() {
		System.out.println("野鸭子===外观是绿头");
	}

	public void fly() {
		System.out.println("野鸭子===用翅膀飞");
	}

	public void quack() {
		System.out.println("野鸭子===呱呱叫");
	}

}
