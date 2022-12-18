package Dec17;

//keyword call "this:
//this key word is used for calling the current class
//it can be method, it can be constructor it can be variable
//this keyword should use first
class kolar{
	
	void kgf()
	{
		
		
	}
	
	
}


public class WesternRailway {

	//Constructor chaining
	//Constructor overloading
	WesternRailway()
	{
		//it will call the current class
		this(10,20,30);
	}
	
	WesternRailway(int a,int b,int c)
	{
		this("abc",6);
	}
	
	WesternRailway(String a,int c)
	{
		
	}
	
	//Method overloading
	void fsdfs()
	{
		
	}
	
	void fsdfs(int b)
	{
		
	}
	
	int sv()
	{
		return 10;
	}
	
	
	
	
	void sdf()
	{
		this.kgf();
		
	}
	
	
	
	
	
	
	
	
	
	
	WesternRailway(int a) {

		this(30, 20); // this statement

		System.out.println(a);

	}

	WesternRailway(int b, int k) {

		this("x");
		System.out.println(b + k);
	}

	WesternRailway(String x) {
		System.out.println(x);
	}

	
	//Method chaining
	//this keyword used for method
	//and this keyword will only recognize or 
	//execute the current class
	void cfg() {
		this.cfg1();
	}

	void cfg1() {
		this.cfg2();
	}

	void cfg2() {

	}

}
