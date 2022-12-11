package Dec11;

class a {

	static void x() {
		System.out.println("x method is pinting in a class");
	}

}
//Method hiding 
class b extends a {
	static void x() {
		System.out.println("x method is pinting in b class");
	}

}
public class discussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a a1 = new b();
		a1.x();

	}
}

//What is final method will it overide? explain
//What is final class will it inherit? exlain
//What is finalize method ?---> garbage collection not related to overiding concept
