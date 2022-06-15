//Type 1 Method Overloading by changing no of passing arguments
package practice;

class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b, int c)
	{
		return a+b+c;
	}
}

public class MethodOverloading1 
{
	public static void main(String[] args) 
	{
		System.out.println(Adder.add(21, 32));
		System.out.println(Adder.add(11,56,26));

	}

}
