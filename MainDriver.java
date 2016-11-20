import java.io.*;

public class MainDriver
{
	public static void main(String args[])
	{	
		QuackBehavior q1 = new Quack();
		QuackBehavior q2 = new Squeak();
		QuackBehavior q3 = new MuteQuack();
		
		FlyBehavior f1 = new FlyWithWings();
		FlyBehavior f2 = new FlyNoWay();
	
		DecoyDuck dduck = new DecoyDuck();
		RedHeadDuck rhduck = new RedHeadDuck();
		RubberDuck rbduck = new RubberDuck();
		MallarDuck mduck = new MallarDuck();

		dduck.setQuackBehavior(q2);
		dduck.setFlyBehavior(f1);
		dduck.display();
		dduck.swim();
		dduck.performQuack();
		dduck.performFly();
				

	}
}
