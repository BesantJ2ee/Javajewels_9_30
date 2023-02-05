package JavaThread_04_02_2023;

public class TestSynchrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Rectangle x1 = new Rectangle();
		//Rectangle x2 = new Rectangle();
		//Rectangle x3 = new Rectangle();
		
		//two threads creatng
		//rectangle object passing to both thread as argument
		
		//i have passed the argument
		Thread1 z = new Thread1(x1);
		Thread2 z1 = new Thread2(x1);
		//using thread object i am starting the thread
		z.start();
		
		z.setPriority(10);
		z1.start();
		z1.setPriority(1);
		
	}

}
