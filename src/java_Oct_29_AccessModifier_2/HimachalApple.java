package java_Oct_29_AccessModifier_2;

public class HimachalApple {

	//When private keyword used in front f method
    //it can access only from that class 
	//not outside the class
	private void appleRate()
	{
		System.out.println("Kilo  "+200);
	}
	
	//When public keyword used in front f method
    //it can access anywher from the project
	public void appleRate2()
	{
		System.out.println("Kilo  "+200);
	}
	
	//When protected keyword used in front f method
    //it cannot acces from outside the package
	protected void appleRate3()
	{
		System.out.println("Kilo  "+200);
	}
	
	//When visiblit access  modifier not there then it 
	//cannot access from outside the package
	void appleRate4()
	{
		
	}
	
}
