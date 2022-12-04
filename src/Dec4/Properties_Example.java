 	package Dec4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Absoluet path
		File file = new 
		File("D://Java_10_30_WeekendBatch//Java_09-July_10_30_Batch//Java_09_July_2022_10_30_Batch//src//java_July_Batch_10_30_Sep17//db.properties");
		FileReader reader=new FileReader(file);  
	      
	    Properties p=new Properties();  
	    p.load(reader); 
	    
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}

}
