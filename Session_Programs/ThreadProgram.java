package ClassPrograms;

import java.time.LocalDateTime;

public class ThreadProgram {

	public static void main(String[] args) {
		int start= LocalDateTime.now().getNano();
		System.out.println("start time:" +start);
		
		//Task1
		Task1 t1=new Task1();
		t1.start();
		
		//Task2
		Task2 t2= new Task2();
		Thread th=new Thread(t2);
		th.start();
		
		//Task3
		Task3 t3=new Task3();
		t3.start();
		
		int end = LocalDateTime.now().getNano();
		System.out.println("End Time:" +end);
		System.out.println("used time:" +(end-start));
	}
}

class Task1 extends Thread{
	public void run() {
		System.out.println("for loop 1 to 99");
		for(int i=1;i<100;i++)
		{
			System.out.print(i+",");
		}
		System.out.println("for loop 1 to 99 end");
	}
}

class Task2 implements Runnable{
	
	
	public void run() {
		System.out.println("for loop 100 to 199");
		for(int i=100;i<200;i++)
		{
			System.out.print(i+",");
		}
		System.out.println("for loop 100 to 199 end");
	}
}

class Task3 extends Thread {
	public void run() {
	System.out.println("for loop 200 to 299");
	for(int i=200;i<300;i++)
	{
		System.out.print(i+",");
	}
	System.out.println("for loop 200 to 299 end");
}
}


