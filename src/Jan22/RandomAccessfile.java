package Jan22;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessfile {
	private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(position);
		byte[] bytes = new byte[size];
		file.read(bytes);
		file.close();
		return bytes;
	}

	private static void writeToFile(String filePath, String data, int position) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		file.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String fread = "D://testout.txt";
		final String fwrite = "D://testout1.txt";
		try {
			System.out.println(new String(readFromFile(fread, 0, 2)));
			 writeToFile(fwrite, "my country and my people", 31);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
