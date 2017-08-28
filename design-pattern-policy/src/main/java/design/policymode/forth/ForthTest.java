package design.policymode.forth;

import design.policymode.forth.change.FlyBehavior;
import design.policymode.forth.change.FlyRockPowerd;
import design.policymode.forth.unchange.Duck;

public class ForthTest {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.swim();
		duck.perFormFly();
		duck.perFormQuack();
		duck = new RedHeadDuck();
		duck.display();
		duck.swim();
		duck.perFormFly();
		duck.perFormQuack();
		duck = new RubberDuck();
		duck.display();
		duck.swim();
		duck.perFormFly();
		duck.perFormQuack();
		System.out.println("----------------动态改变鸭子的行为------------------");
		FlyBehavior flyBehavior = new FlyRockPowerd();
		duck.setFlyBehavior(flyBehavior);//动态改变鸭子飞的行为
		duck.display();
		duck.swim();
		duck.perFormFly();
		duck.perFormQuack();
	}
}
