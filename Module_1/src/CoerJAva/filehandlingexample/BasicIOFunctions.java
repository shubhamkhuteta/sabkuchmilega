package filehandlingexample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicIOFunctions {

	public static void main(String[] args) throws IOException {
		String name_1;
		String name_2;
		int n = 0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What you want to create : \n1. File\n2. Directory");
		n=sc.nextInt();
		if(n==1) {
			
			System.out.println("Enter the file name : ");
			name_1=sc.next();
			File f=new File(name_1);
		
			if(f.exists()==true)
			{
				System.out.println("File already exist!!");
			}
			else 
			{
				f.createNewFile();
			}
		}
		else 
		{
			System.out.println("Enter the directory name : ");
			name_2=sc.next();
			File f1=new File(name_2);
			
			if(f1.exists()==true)
			{
				System.out.println("Directory already exist!!");
			}
			else {
				f1.mkdir();
			}
		}
		
		
		
		/*name=sc.nextLine();
		
		
		
		
		f.mkdir();
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.mkdir());
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.getPath());
		System.out.println("File Created!");*/
		
	}
}
