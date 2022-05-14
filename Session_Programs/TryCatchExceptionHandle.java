package ClassPrograms;

public class TryCatchExceptionHandle {

	public static void main(String[] args) {
		try {
			String s=  null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
		checkAge(16);
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		} 
		catch (Exception e) {
		      System.out.println("Something went wrong.");
		      System.exit(0);  //this is only code which will not allow to execute finally
		} 
		finally {
		      System.out.println("The 'try catch' is finished.");
		}
		
	}
		static void checkAge(int age) {
	    try {
			if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }catch(ArithmeticException e) {
		  System.out.println(e.getMessage());
	  }
	  }
}


