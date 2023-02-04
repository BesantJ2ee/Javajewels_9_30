package JavaThread_04_02_2023;

public class ThreadCreation extends Thread{
	public void run(){  
		System.out.println("thread is running...");  
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCreation j1 =new ThreadCreation();
		ThreadCreation j2 =new ThreadCreation();
		ThreadCreation j3 =new ThreadCreation();
		j1.start();
		j2.start();
		j3.start();
	}

}
