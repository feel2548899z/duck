import java.io.*;

public class Duck
{
	private QuackBehavior m_q;
	//private FlyBehavior m_f;

	public void swim(){
		System.out.println("I am a duck ,and I can swim.");
	}
	public void performFly(){
			
	}
	public void performQuack(){
		this.m_q.quack();	
	}
	public void setQuackBehavior( QuackBehavior q){
		 this.m_q = q;
	}
	public void setFlyBehavior(  ){
		
	}
	public void display(){
		System.out.println("I am Duck");
	}

}
