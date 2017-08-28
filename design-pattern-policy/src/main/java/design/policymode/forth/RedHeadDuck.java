package design.policymode.forth;

import design.policymode.forth.change.FlyWithWings;
import design.policymode.forth.change.Quack;
import design.policymode.forth.unchange.Duck;

/**
 * @author houzm
 *	红头类
 */
public class RedHeadDuck extends Duck{

	
	public RedHeadDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("红头鸭子===外观是红头");
	}



}
