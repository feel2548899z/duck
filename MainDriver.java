import java.io.*;

public class MainDriver
{
	public static void main(String args[])
	{	
		Quack q1 = new QuackBehavior();
		Squeak q2 = new QuackBehavior();
		MuteQuack q3 = new QuackBehavior();
	
		q1.quack();
		q2.quack();
		q3.quack();
	  
		DecoyDuck dduck = new DecoyDuck();
		RedHeadDuck rhduck = new RedHeadDuck();
		RubberDuck rbduck = new RubberDuck();
		MallarDuck mduck = new MallarDuck();

		dduck.display();
		rhduck.display();
		rbduck.display();
		mduck.display();
	}
}
