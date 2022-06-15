package practice;

class operation
{
	int square(int n)
	{
		return n*n;
	}
}
class Circle
{
	operation op; 		//aggregation
	double pi=3.14;
	double area(int radius)
	{
		op=new operation();
		//code reusability (i.e. delegates the method call)
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
}

public class AggregationExample 
{
	public static void main(String[] args) 
	{
		Circle C=new Circle();
		double result=C.area(5);
		System.out.println(result);

	}

}
