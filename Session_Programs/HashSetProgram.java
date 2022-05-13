package ClassPrograms;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    System.out.println("size of hashset:" +cars.size());
	    
	    //iterate the value
	    for(String i : cars)
	    {
	    	System.out.println(i);
	    }
	    
	    //remove the element
	    cars.remove("BMW");
	    System.out.println(cars);
	    
	    System.out.println("Is BMW is present :" +cars.contains("BMW"));
	    System.out.println("Is BMW is present :" +cars.contains("Mazda"));
	    
	    cars.clear();
	    System.out.println("Cars after clear method: " +cars);
	}
/*[Volvo, Mazda, Ford, BMW]
size of hashset:4
Volvo
Mazda
Ford
BMW
[Volvo, Mazda, Ford]
Is BMW is present :false
Is BMW is present :true
Cars after clear method: []*/
	
}
