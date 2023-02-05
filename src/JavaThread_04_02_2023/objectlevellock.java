package JavaThread_04_02_2023;

public class objectlevellock implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Lock();
	}
	
	public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        //synchronized block
        //synchronized (this) Class level not happening
        //Synchronized-> At a time on;y one thread only permitted inside
        synchronized (this)//class level lock is happening
        {
            System.out.println(
                "in block "
                + Thread.currentThread().getName());
            System.out.println(
                "in block "
                + Thread.currentThread().getName()
                + " end");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		objectlevellock v1 = new objectlevellock();
		Thread c1 = new Thread(v1);
		
		
		objectlevellock v2 = new objectlevellock();
		Thread c2 = new Thread(v2);
		
		
		c1.setName("thread1");
		c2.setName("thread2");
		
		c1.start();
        c2.start();
		
	}

}
