package Dec10;

//Parent class
//This feature is called overriding
//In overiding the method in parent class and child class s
//should be same
class owl
{
    void flyingSpeed(int a)
    {
    	int time =2;
		int distance =40;
		int speed=0;
		speed=distance/time;
		System.out.println("Parent"+speed);
    	
    }
	int findtheDistanceofflight()
	{
		int speed =40;
		int time =2;
		int distance =0;
		distance=speed*time;
		return distance;
	}
}
//Sub class/Child class
class birds extends owl{
	//Overriding methods 	
	void flyingSpeed(int a)
    {
		//Immediate parent class method
		//super.flyingSpeed(10);
		int time =8;
		int distance =400;
		int speed=0;
		speed=distance/time;
		System.out.println("child"+speed);
		super.flyingSpeed(10);
    }
	
	//Overriding methods 
	 int findtheDistanceofflight()
		{
		 super.findtheDistanceofflight();
		 int speed =4000;
			int time =34;
			int distance =0;
			distance=speed*time;
			return distance;
		}
	
}


public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		owl a1 = new owl();
	//	a1.flyingSpeed(10);
	//	System.out.println(a1.findtheDistanceofflight());
		
		
		birds a2 = new birds();
		a2.flyingSpeed(10);
		System.out.println(a2.findtheDistanceofflight());
		
		//Run time polymorphism
		//compile time polymorphism and run time polymorphism
		//What is polymorphism
		//Same task its showing differenet way
		//overriding comes under run time polymorphism
		owl a3 = new birds();
		a3.flyingSpeed(10);
		System.out.println(a3.findtheDistanceofflight());
		
		
	}

}
