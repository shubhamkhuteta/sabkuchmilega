package filehandlingexample;
import java.io.*;

public class PrintWriterEx 
{
	public static void main(String[] args) throws IOException 
	{	
		//Creating file
		FileWriter fw=new FileWriter("shubha_m.txt");
		PrintWriter pw=new PrintWriter(fw);
		System.out.println("File Created!");
		
		
		
		//Writing data
		pw.println(10000);
		pw.println("\n\n\n\n"+true);
		pw.println('a');
		pw.println("\n\n\n\n\n\n@#$%^&");
		System.out.println("File Written!!");
		
		
		//closing the file
		pw.flush();
		pw.close();
		System.out.println("File Closed!!");
	}
}
