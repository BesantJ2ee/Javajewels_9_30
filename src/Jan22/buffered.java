package Jan22;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class buffered {

	public static void main(String[] args) 
			throws FileNotFoundException {

		// TODO Auto-generated method stub
		// input and output related to coming to system and going out from system
		LocalDateTime s1 = LocalDateTime.now();
		s1.getSecond();
		String time="ap";
		
		FileOutputStream fout = new FileOutputStream("D:\\testout"+s1.getSecond()+".txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Java class completes";
		byte b[] = s.getBytes();
		try {
			bout.write(b);
			bout.flush(); // clean up
			bout.close(); // clean up buffered oustream
			fout.close(); // cleam up file output stream
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("success");
	}

}
