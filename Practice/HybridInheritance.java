package practice;

class C						//parent class
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C			//inherited child class of C class
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B extends C			//inherited child class of C class		
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class HybridInheritance extends A
{
   public void disp()
   {
	System.out.println("HybridInheritance class");
   }
   
   public static void main(String args[])
   {
	   HybridInheritance obj = new HybridInheritance();
	   obj.disp();
   }
}
