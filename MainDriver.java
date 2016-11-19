import java.io.*;

public class MainDriver
{
	public static void main(String args[])
	{	
		QuackBehavior q1 = new Quack();
		QuackBehavior q2 = new Squeak();
		QuackBehavior q3 = new MuteQuack();
	
		DecoyDuck dduck = new DecoyDuck();
		RedHeadDuck rhduck = new RedHeadDuck();
		RubberDuck rbduck = new RubberDuck();
		MallarDuck mduck = new MallarDuck();

		dduck.setQuackBehavior(q2);
		dduck.display();
		dduck.performQuack();
				

	}
}
