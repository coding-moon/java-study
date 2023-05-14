package born;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnector {
	public static final String PATH = "src/boy.txt";
	public static final String PATH_1 = "src/girl.txt";
	
	public static BufferedWriter getWriter() throws IOException {
		return new BufferedWriter(new FileWriter(PATH));
	}
	
	public static BufferedWriter getWriter() throws IOException	{
		return new BufferedWriter(new FileWriter(PATH_1));
		
	}
}
