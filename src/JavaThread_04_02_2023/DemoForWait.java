package JavaThread_04_02_2023;

public class DemoForWait extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fight vb = new Fight();
		new Thread() {
            @Override 
            public void run() 
            { 
            vb.fire(60); 
            }
        }.start();
  
        // Creating a new thread and invoking
        // our reload method on it
        new Thread() {
         @Override 
        public void run() 
         { 
         vb.reload(); 
         }
        }.start();
		
		
		
		
	}

}
