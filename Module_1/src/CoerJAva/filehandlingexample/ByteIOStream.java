package filehandlingexample;

import java.io.*;

public class ByteIOStream {
	public static void main(String[] args) throws IOException {
		String name="ByteStream.txt";
		
		//Byte Stream for writing the data
		FileOutputStream fos= new FileOutputStream(name);
		
		for(int i=0;i<10;i++) {
			fos.write(i);
		}
		
		fos.write(124);
		fos.write(12);
		
		//Byte Stream for reading the data
		FileInputStream fis=new FileInputStream(name);
		int i;
		int x=1;
		while((i=fis.read()) != -1) {
			System.out.println(x+"Data :"+i);
			x++;
		}
	}
}
