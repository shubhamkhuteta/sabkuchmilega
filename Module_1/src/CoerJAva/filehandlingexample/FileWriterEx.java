package filehandlingexample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Shubham.txt");
		
		fw.write(97);
		fw.write("Shubham \n Khuteta");
		fw.write("\n");
		char[] ch1= {'a','b','c'};
		fw.write(ch1);
		fw.write("\n");
		
		fw.flush();
		fw.close();
		
		
	}
}
