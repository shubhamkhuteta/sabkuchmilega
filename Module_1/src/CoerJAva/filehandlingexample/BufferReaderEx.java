package filehandlingexample;

import java.io.*;
public class BufferReaderEx {
	
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("Shubham.txt");
		BufferedReader br=new BufferedReader(f);
		
		String line=br.readLine();
		
		//int i=fr_1.read();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			System.out.println("The line number is " + new Exception().getStackTrace()[0].getLineNumber());
			//System.out.println(br.lines());
			//System.out.println(fr_1.getClass());
		}
	}

}
