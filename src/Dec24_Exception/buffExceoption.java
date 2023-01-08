package Dec24_Exception;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class buffExceoption {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:\\testout24.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "goodbye.";
		byte b[] = s.getBytes();
		try {
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("success");

	}

}
