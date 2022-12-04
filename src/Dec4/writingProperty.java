package Dec4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class writingProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Assighnment keeep the file to be come in a folder
		
		Properties p=new Properties();  
		p.setProperty("name","sgs");  
		p.setProperty("email","sgsge@gmail");  
		  
		p.store(new FileWriter("info.properties")," Xyz Properties");  
		
		
	}

}
