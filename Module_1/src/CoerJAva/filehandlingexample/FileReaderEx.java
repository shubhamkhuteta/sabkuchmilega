package filehandlingexample;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
	
		/*File f=new File("car.txt");
		FileReader fr = new FileReader(f);
		char[] ch= new char[(int) f.length()];
		
		fr.read(ch);
		*/
		FileReader fr_1=new FileReader("Shubham.txt");
		int i=fr_1.read();
		
		while(i!=-1) {
			System.out.println((char)i);
			i=fr_1.read();
			//System.out.println(fr_1.getClass());
		}
		
		
	
	}
}
