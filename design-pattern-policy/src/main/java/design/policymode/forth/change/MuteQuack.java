package design.policymode.forth.change;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("====静音鸭====");
	}

}
