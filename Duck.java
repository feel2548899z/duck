import java.io.*;

public class Duck
{
	private QuackBehvior q;
	private FlyBehavior f;	

	public void swim(){
		System.out.println("I am a duck ,and I can swim.");
	}
	public void performFly(){
				
	}
	public void performQuack(QuackBehavior q){
		Quack.quack();
		Squeak.quack();
		MuteQuack.quack();	
	}
	public void setQuackBehavior(q){
		this.q = q;
	}
	public void setFlyBehavior(){
		
	}
	public void display(){
		System.out.println("I am Duck");
	}

}
