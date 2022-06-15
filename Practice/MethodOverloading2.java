//Type 2 Method Overloading by changing return type and data type of argument

package practice;

class Adder1
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
}

public class MethodOverloading2 
{
	public static void main(String[] args) 
	{
		System.out.println(Adder1.add(21, 32));
		System.out.println(Adder1.add(11.30,56.86));

	}

}

