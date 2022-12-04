package Dec4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class FileMaindcsf {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //	Creating a file object 
		File cd  = new File("D://Reference//Fruits.properties");
		
		//Creating a file reader obect with usage of file object
		FileReader readerv=new FileReader(cd);
		
		//creating property object and 
		//LOad method and pass the filereader object
		Properties p=new Properties();  
	    p.load(readerv);
	    
	    System.out.println(p.getProperty("grape"));
	//    System.out.println(p.getProperty("orange"));
		
	}

}
