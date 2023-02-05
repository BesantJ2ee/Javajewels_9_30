package JavaThread_04_02_2023;

public class ShiftOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //left shift operator
		int number = 2;
		 
        // 2 bit left shift operation
        int Ans = number << 3;
 
        System.out.println(Ans+"Leftshift");
        //When the value of a number is shifted to the left two places, 
        //the leftmost two bits are lost. The number has a value of two. 
        //0010 is the binary representation of the number
        
       // rightshift
        
        int number1 = 8;
		 
        // 2 bit left shift operation
        int Ans1 = number1 >> 2;
 
        System.out.println(Ans1+"Rightshift");
	}

}
