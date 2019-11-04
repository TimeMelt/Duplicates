package Stevens_p2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class application {

	public static void main(String[] args) throws IOException {
		Scanner dataFile = new Scanner(new File("problem2.txt"));
		DuplicateCounter.count(dataFile);
		DuplicateCounter.write();
	}

}
