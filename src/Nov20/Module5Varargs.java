package Nov20;

public class Module5Varargs {

	void display(String... args)
	{
		//System.out.println(args);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	
	void display2(Integer... args)
	{
		//System.out.println(args);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	
	void display2(String c,Integer... args)
	{
		//System.out.println(args);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	void display3(Boolean... args)
	{
		//System.out.println(args);
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
	
	public static void main(String... args) {
		// TODO Auto-generated method stub

		Module5Varargs cv = new Module5Varargs();
		cv.display("a","b","c","d");
		cv.display2(1,2,3,4,5,2,4);
		cv.display3(true,false,true);
	}

}
