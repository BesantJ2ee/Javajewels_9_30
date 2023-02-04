package JavaThread_04_02_2023;

public class Thread2 extends Thread{
	Rectangle x = new Rectangle();
	Thread2(	Rectangle x)
	{
		this.x=x;
	}
	
	public void run(){  
		x.printTable(5);  
	}
	
}
