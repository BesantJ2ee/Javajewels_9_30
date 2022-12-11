package Dec10;

public interface Summary {
   //if you are writing static and default method u have to specify the body
	//if you are writing abstract method then no body
	//After Java 5 or 7 interface is allowig default method and static method
	//before it allow only abstract methods
    static void x()
	{
		System.out.println("An interface with static method");
	}
    
    static void x1()
	{
		System.out.println("An interface with static method");
	}
    
    default void z()
    {
    	
    	System.out.println("An interface with default method");
    }
    
    default void z2()
    {
    	
    	System.out.println("An interface with default method");
    }
	
    
    abstract void k();
	
}
