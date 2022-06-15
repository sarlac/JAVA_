package practice;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
public class BankROI {

	public static void main(String[] args) 
	{
		SBI sbi=new SBI();
		ICICI icici=new ICICI();
		AXIS axis=new AXIS();
		
		System.out.println("SBI rate of interest is : " +sbi.getRateOfInterest());
		System.out.println("ICICI rate of interest is : " +icici.getRateOfInterest());
		System.out.println("AXIS rate of interest is : " +axis.getRateOfInterest());

	}

}
