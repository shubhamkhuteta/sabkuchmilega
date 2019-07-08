package filehandlingexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("ShubhamKhuteta_1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("File Created!!");
		bw.write(97);
		bw.write("Shubham \n Khuteta");
		bw.write("\n");
		char[] ch1= {'a','b','c'};
		bw.write(ch1);
		bw.write("\n");
		System.out.println("File Written!!");
		
		bw.flush();
		bw.close();
		System.out.println("File Closed!!");
	}
}
