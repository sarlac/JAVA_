//Employee has an object of Address, address object contains its own informations such as city, state, country etc. 
//In such case relationship is Employee HAS-A address.
package practice;

public class Address 
{
	String city, State, country;
	public Address(String city,String State,String country)
	{
		this.city=city;
		this.State=State;
		this.country=country;
	}

}
