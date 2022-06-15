//Program to implement method overridding using method run()
package practice;
class vehicle1					//creating parent class
{
	void run()
	{
		System.out.println("Vehicle is running...");
	}
}
class Bike extends vehicle1		//creating child class
{
	void run()
	{
		System.out.println("Bike is running...");
	}
	public static void main(String[] args) 
	{
		Bike obj= new Bike();	//creating object
		obj.run();				//calling method run 
	}
}
