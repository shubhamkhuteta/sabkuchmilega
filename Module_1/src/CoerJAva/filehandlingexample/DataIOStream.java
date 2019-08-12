package filehandlingexample;

import java.io.*;
import java.nio.file.attribute.DosFileAttributes;

public class DataIOStream {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("DataStream.txt");
		DataOutputStream dos=new DataOutputStream(fos);
	
		String s="Shubham";
		byte[] b=s.getBytes();
		
			//dos.writeBoolean(true);
			//dos.write(b);
			//dos.writeChar('a');
			dos.writeInt(12432);
			//dos.writeUTF("Shubham");
			
		System.out.println("File created and written!!");
		
	}
}
	//Byte Stream for writing the data
	
	
	

	/*FileInputStream fis=new FileInputStream(name);
	BufferedInputStream bis=new BufferedInputStream(fis);
	
	int i;
	while((i=bis.read()) != -1) {
		System.out.println((char)i);*/
