package Jan22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class printwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter(System.out);
		List<String> a1 = new ArrayList<String>();
		a1.add("ball");
		a1.add("bat");
		a1.add("tennis");
		StringBuffer a2 = new StringBuffer();

		for (String a : a1) {
			a2.append(",").append(a);
		}
		writer.write(a2.toString().substring(1));
		writer.flush();
		writer.close();
		// Data to write in File using PrintWriter
		// writng into file
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("D:\\testoutt.txt"));
		writer1.write("Like Java, Android, PHP etc.");
		writer1.flush();
		writer1.close();
	}
}
