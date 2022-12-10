package Dec10;

//How many abstract method written in the interface all those meethods
//should be implemented in the implemention class
public class Drive implements Train,Vehicle,Flight{

	@Override
	public void flyingSpeed(int a) {
		// TODO Auto-generated method stub
		int time =2;
		int distance =40;
		int speed=0;
		speed=distance/time;
		System.out.println("Parent"+speed);
	}

	@Override
	public int xyz() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void traintime() {
		// TODO Auto-generated method stub
		
	}

}
