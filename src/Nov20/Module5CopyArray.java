package Nov20;
import java.util.Arrays;

public class Module5CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] copyFrom = {
	            "Jonn", "Michael", "Pepe", "Ronaldinho", "Ferminho",   
	            "Virat", "Schumacher", "akshay", "srk", 
	            "sushantsingh", 
	            "abhishekh",      
	            "harrisonford", 
	            "caprio" };
	 
	 String[] copyTo = new String[4];
	 
	 System.arraycopy(copyFrom, 1, copyTo, 0, 4);
	 
	 for(int i=0;i<copyTo.length;i++)
	 {
	 //   System.out.println(copyTo[i]);
	 }
	 //copy range
	 
	 String[] copyTow = Arrays.
			 copyOfRange(copyFrom, 0, 5); 
	 
	 for(int i=0;i<copyTow.length;i++)
	 {
		 System.out.println(copyTow[i]);
	 }
	 
	 
	 
	 
	 

	}

}
