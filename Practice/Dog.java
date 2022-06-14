//single inheritance

package practice;

class Animal				//parent class
{
	void eat()				//method
	{
		System.out.println("Eating....");
	}
}
class TestInheritance extends Animal			//inherited child class
{  
	void bark()									//bark method
	{
		System.out.println("barking...");
	}  
}  
class Dog
{  
public static void main(String args[])
{  
	//created object
	TestInheritance d=new TestInheritance();
	d.eat(); 
	d.bark();  
	 
}
}  