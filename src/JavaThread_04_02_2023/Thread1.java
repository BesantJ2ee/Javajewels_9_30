package JavaThread_04_02_2023;

public class Thread1 extends Thread {
    Rectangle x = new Rectangle();
	//Constructor 
    Thread1(	Rectangle x)
	{
		this.x=x;
	}
	
	public void run(){  
		x.printTable(100);  
	}
	
}
