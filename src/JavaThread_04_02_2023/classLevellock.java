package JavaThread_04_02_2023;

public class classLevellock implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Lock();
	}
	
	public void Lock()
    {
        System.out.println(
            Thread.currentThread().getName());
        synchronized (classLevellock.class)
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

		classLevellock v1 = new classLevellock();
		Thread c1 = new Thread(v1);
		
		
		classLevellock v2 = new classLevellock();
		Thread c2 = new Thread(v2);
		
		
		c1.setName("t1");
		c2.setName("t2");
		
		c1.start();
		
        c2.start();
      
		
		
	}

	
	
	
 

}
