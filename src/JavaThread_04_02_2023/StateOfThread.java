package JavaThread_04_02_2023;

public class StateOfThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printTable();
		System.out.println("This code is running in a thread");
	}

	synchronized void printTable() {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Godfather v = new Godfather();

		StateOfThread v = new StateOfThread();

		Thread c = new Thread(v);
		c.start();
		c.setPriority(10);
		System.out.println(c.getState()+"Thread1");
		Thread c1 = new Thread(v);
		c1.start();
		System.out.println(c1.getState()+"Thread2");
		Thread c2 = new Thread(v);
		c2.start();
		c2.setPriority(1);
		System.out.println(c2.getState()+"Thread3");
		System.out.println(c2.getState());

	}

}
