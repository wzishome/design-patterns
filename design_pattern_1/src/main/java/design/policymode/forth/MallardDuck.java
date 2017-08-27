package design.policymode.forth;

import design.policymode.forth.change.FlyWithWings;
import design.policymode.forth.change.Quack;
import design.policymode.forth.unchange.Duck;

/**
 * @author houzm
 *	野鸭类
 */
public class MallardDuck extends Duck {

	public MallardDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("野鸭子===外观是绿头");
	}

}
