package Stevens_p1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class DuplicateRemover {
	static ArrayList<String> Words = new ArrayList<>();
	
	public static void remove(Scanner dataFile) throws IOException {
		
	    while (dataFile.hasNext()) {
	        Words.add(dataFile.next());
	    }
	    dataFile.close();
	    
	}
	
	public static void write() throws IOException {
		HashSet<String> uniqueWords = new HashSet<String>(Words);
		String n = uniqueWords.toString();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("unique_words.txt"));
		writer.write(n);
		writer.close();
		
	}
}
