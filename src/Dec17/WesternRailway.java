package Dec17;

//keyword call "this:
//this key word is used for calling the current class
//it can be method, it can be constructor it can be variable
//this keyword should use first
public class WesternRailway {

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
