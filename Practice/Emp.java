package practice;

public class Emp 
{
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+ "  " +name);
		System.out.println(address.city + "  "+address.State + "  "+ address.country);
	}
		
	public static void main(String[] args) 
	{
		Address adress1=new Address("Ajani","Maharashtra","India");
		Address adress2=new Address("Shirur Anantpal","Maharashtra","India");
		
		Emp emp1=new Emp(101,"Sarla",adress1);
		Emp emp2=new Emp(102,"Anant",adress2);
		
		emp1.display();
		emp2.display();
	}

}
