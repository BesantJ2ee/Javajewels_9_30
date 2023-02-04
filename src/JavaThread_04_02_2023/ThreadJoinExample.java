package JavaThread_04_02_2023;
//java.lang.Thread class provides the join() method 
//which allows one thread to 
//wait until another thread completes its execution

class GFG extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            }
  
            catch(Exception ex)
            {
                System.out.println("Exception has" +
                                " been caught" + ex);
            }
            System.out.println(i);
        }
    }
} 
class ThreadJoinExample
{
    public static void main (String[] args)
    {
  
        // creating three threads
    	GFG t1 = new GFG();
    	GFG t2 = new GFG();
    	GFG t3 = new GFG();
  
        // thread t1 starts
        t1.start();
          
        // starts second thread after when
        // first thread t1 has died.
        try
        {
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
            t1.join();
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
  
        // t2 starts
        t2.start();
  
        // starts t3 after when thread t2 has died.
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t2.join();
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
  
        t3.start();
    }
}
