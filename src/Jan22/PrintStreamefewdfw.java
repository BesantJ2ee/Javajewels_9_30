package Jan22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamefewdfw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("D://mfile.txt");  
		   PrintStream pout=new PrintStream(fout);  
		   pout.println(1900);  
		   pout.println("Hello Java");  
		   pout.println("Welcome ");  
		   pout.close();  
		   fout.close();  
	}

}
