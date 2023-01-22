package Jan22;

import java.io.ByteArrayInputStream;

public class BytearrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf = { 2, 4, 7, 3 };  
	    // Create the new byte array input stream  
	    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	}

}
