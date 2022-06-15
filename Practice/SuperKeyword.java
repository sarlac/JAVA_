//program to implement super keyword
package practice;
class Anim				//parent class
{
	//data member
	String color="White";
	//method in Animal class
	void eat()
	{
		System.out.println("eating...");
	}
	//constructor in Animal class
	Anim()
	{
		System.out.println("Animal is created");
	}
}
class Dg2 extends Anim		//child class
{
	// using super to access data member from parent class
	String color="Black";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);	//use of super class to access data members of parent class
	}
	//using super to invoke method from parent class
	void eat()
	{
		super.eat();
		System.out.println("Dog is eating....");
	}
	//using super keyword super to invoke constructor from parent class
	Dg2()
	{
		super();
		System.out.println("Dog is created");
	} 
}
public class SuperKeyword 
{
	public static void main(String[] args) 
	{
		Dg2 D=new Dg2();  //created object of child class
		D.display();		
		D.eat();			
	}
}
