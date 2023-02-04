package JavaThread_04_02_2023;

public class ThreadPriorirty extends Thread {

	public void run()  
	{  
	// the print statement  
	System.out.println("Inside the run() method");  
	}  
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         //creating two threads and call two start method
		ThreadPriorirty vb = new ThreadPriorirty();
		Thread c1 = new Thread(vb);
		//Anew thread is created
		c1.start();
		//start method
		c1.setPriority(MAX_PRIORITY);
		
		ThreadPriorirty vb1 = new ThreadPriorirty();
		Thread c2 = new Thread(vb1);
		c2.start();
		c2.setPriority(MIN_PRIORITY);
	//	c2.join();
	
		ThreadPriorirty vb2 = new ThreadPriorirty();
		Thread c3 = new Thread(vb2);
		c3.start();
		c3.setPriority(NORM_PRIORITY);
		
		
		
		//System.out.println("Priority of the thread th1 is : " + c1.getPriority());  
		//System.out.println("Priority of the thread th2 is : " + c2.getPriority());
		//System.out.println("Priority of the thread th23 is : " + c3.getPriority());
		System.out.println(c1.getState());
		System.out.println(c2.getState());
		System.out.println(c3.getState());
		
	}

}
