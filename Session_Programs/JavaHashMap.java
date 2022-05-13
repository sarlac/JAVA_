package ClassPrograms;

import java.util.HashMap;

public class JavaHashMap {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("India", "Delhi");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		
		System.out.println("Size of hashmap: " +capitalCities.size());
		System.out.println("remove item of hashmap: " +capitalCities.remove("England"));
		System.out.println("Map after remove element " +capitalCities);
		
		String capitalofIndia =capitalCities.get("India");
		System.out.println("Capital of India: " +capitalofIndia );
		
		//for loop to iterate the hashmap
		for(String i : capitalCities.keySet())
		{
			System.out.println(i + ":" +capitalCities.get(i));
		}
	
		System.out.println("Hashmap after clear method:");
		capitalCities.clear();
		System.out.println(capitalCities);
	}

	/* OUTPUT::
	
	{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin, India=Delhi}
	Size of hashmap: 5
	remove item of hashmap: London
	Map after remove element {USA=Washington DC, Norway=Oslo, Germany=Berlin, India=Delhi}
	Capital of India: Delhi
	USA:Washington DC
	Norway:Oslo
	Germany:Berlin
	India:Delhi
	Hashmap after clear method:
	{}
	*/
}


 



