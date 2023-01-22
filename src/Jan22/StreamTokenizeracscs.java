package Jan22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class StreamTokenizeracscs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("D://testout24.txt"); 
        BufferedReader bufferread = new BufferedReader(reader); 
        StreamTokenizer token = new StreamTokenizer(bufferread); 
        // Use of commentChar() method 
        token.commentChar('a'); 
        int t; 
        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF) 
        { 
            switch (t) 
            { 
            case StreamTokenizer.TT_NUMBER: 
                System.out.println("Number : " + token.nval); 
                break; 
            case StreamTokenizer.TT_WORD: 
                System.out.println("Word : " + token.sval); 
                break; 
  
            } 
        } 
	}

}
