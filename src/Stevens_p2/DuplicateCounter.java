package Stevens_p2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DuplicateCounter {
	static ArrayList<String> Words = new ArrayList<>();
	static Map <String, Integer> wordCounts = new TreeMap<String, Integer>();
	static String word = null;
	
	 public static void count(Scanner dataFile) {
		while(dataFile.hasNext()) {
            word = dataFile.next();
            if(!wordCounts.containsKey(word))
                wordCounts.put(word, 1);
            else
                wordCounts.put(word, wordCounts.get(word) + 1);
        }
	}
	
	public static void write() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("unique_words_count.txt"));
		writer.write(word);
		writer.close();
	}
}
