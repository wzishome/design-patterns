package design.policymode.forth;

import design.policymode.forth.change.FlyNoWay;
import design.policymode.forth.change.Squeak;
import design.policymode.forth.unchange.Duck;

/**
 * @author houzm
 *	木头鸭类
 *	因为不会飞：所以我们要覆写超类的fly方法
 *	因为不会呱呱叫：所以要覆写超类的quack方法
 */
public class RubberDuck extends Duck{

	public RubberDuck(){
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("木头鸭子===外观是木头头");
	}

}
