package Stevens_p1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws IOException {
		Scanner dataFile = new Scanner(new File("problem1.txt"));
		DuplicateRemover.remove(dataFile);
		DuplicateRemover.write();
	}

}
