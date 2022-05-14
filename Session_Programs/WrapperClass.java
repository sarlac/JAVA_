package ClassPrograms;

public class WrapperClass {

	public static void main(String[] args) {
		Integer myInt = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue()); 
	    
	    //using methods
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	            
	    //using tostring method
	    String myString=myInt.toString();
	    System.out.println("length of string :"+myString.length());

	}

}
