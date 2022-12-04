package Dec4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Studentp xc = new Studentp();
			xc.setName("Arun");
			xc.setAge(5);
//Create a student object with serializable inteface implemented
			FileOutputStream out = new FileOutputStream("f.txt");
//Need to creare fileoutput stream class use the object
			ObjectOutputStream out1 = new ObjectOutputStream(out);
//Create aa Objectoutputstram 
			out1.writeObject(xc);
//Writeobject			
//Flush method used for cleaning up the process after writing
			out1.flush();
			// closing the stream after write operation
			out1.close();

			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
