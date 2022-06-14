package practice;

class Employ		//parent class
{
	int salary=40000;			//attribute
}
 class Company1 extends Employ	//inherited child class
{
	int bonus=10000;		//attribute

	public static void main(String[] args) 
	{
		//created object of class company1
		Company1 C=new Company1();
		
		System.out.println("Company1 salary is:" +C.salary);
		System.out.println("Company1 bonus is:" +C.bonus);
	}

}
