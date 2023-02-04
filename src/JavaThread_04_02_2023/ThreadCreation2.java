package JavaThread_04_02_2023;

public class ThreadCreation2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadCreation2 dsf= new ThreadCreation2();
		Thread df= new Thread(dsf);
		df.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

}
