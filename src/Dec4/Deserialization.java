package Dec4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{  
			  //Creating stream to read the object  
			 FileInputStream cv = new FileInputStream("f.txt");
			 
			  ObjectInputStream in=new ObjectInputStream(cv);  
			  Studentp s=(Studentp)in.readObject(); 
			  
			  System.out.println(s.getName());
			  System.out.println(s.getAge());
			  
			  
			    
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
			 }  
	

}
