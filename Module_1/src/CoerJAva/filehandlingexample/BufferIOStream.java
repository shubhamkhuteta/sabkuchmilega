package filehandlingexample;

import java.io.*;

public class BufferIOStream {
	public static void main(String[] args) throws IOException {
		String name="BufferStream.txt";
		
		//Byte Stream for writing the data
		FileOutputStream fos= new FileOutputStream(name);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		String s="Shubham";
		byte[] b=s.getBytes();
		bos.write(b);
		bos.flush();
		
		/*for(int i=0;i<10;i++) {
			fos.write(i);
		}*/
		
	/*	fos.write(124);
		fos.write(12);
		*/
		//Byte Stream for reading the data
		FileInputStream fis=new FileInputStream(name);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int i;
		while((i=bis.read()) != -1) {
			System.out.println((char)i);
	}
}
}