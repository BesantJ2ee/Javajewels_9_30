package dec17_sample;

public interface Apple1 {
	abstract void fruits();
	
	
	default void abc()
	{
		System.out.println("default method");
	}
	
	static void cv()
	{
		System.out.println("static methods");
	}
	
	
}
