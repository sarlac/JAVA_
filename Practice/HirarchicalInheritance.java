//program for hirachical inheritance

package practice;

class Animal2			//parent class
{  
	void eat()			//method
	{
		System.out.println("eating...");
	}  
}  
class Dog2 extends Animal2		//inherited child class1
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  
class Cat extends Animal2		//inherited child class2-declaration and definition
{  
	void meow()
	{
		System.out.println("meowing...");
	}  
}  
public class HirarchicalInheritance 
{
	public static void main(String[] args) 
	{
		Cat c=new Cat();  
		c.meow();  
		c.eat();
		
		Dog2 d=new Dog2();
		d.bark();  
		 	
		}

}
