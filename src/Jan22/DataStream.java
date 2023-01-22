package Jan22;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("D:\\testout24.txt");  
	    DataInputStream inst = new DataInputStream(input);  
	    int count = input.available();  
	    byte[] ary = new byte[count];  
	    inst.read(ary);  
	    for (byte bt : ary) {  
	      char k = (char) bt;  
	      System.out.print(k);  
	    }  
	}

}
