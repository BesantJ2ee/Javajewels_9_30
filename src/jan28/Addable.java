package jan28;


@FunctionalInterface
public interface Addable {
	//abstract method
	//an interface having one abstract method is called functional interface
	int add(int a,int b); 
	//int add2(int a,int b);
	
	default void say()
	{
		System.out.println("Calcuttta");
	}
	
	default void say2()
	{
		System.out.println("Calcuttta");
	}
	
}
