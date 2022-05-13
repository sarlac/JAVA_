package test1;

	
public class AddAmount 
{
	int amount=50;
	AddAmount()
	{
		amount=amount+0;
	}
	AddAmount(int a)
	{
		amount=amount+a;
	}
	public static void main(String[] args) 
	{
	AddAmount A1=new AddAmount();
	System.out.println("Piggi Bank Savings :" +A1.amount);

	AddAmount A2=new AddAmount(30);
	System.out.println("Piggi Bank Savings :" +A2.amount);
	}

}
