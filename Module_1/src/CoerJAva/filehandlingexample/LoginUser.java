package filehandlingexample;

import java.io.*;
import java.util.Scanner;

public class LoginUser {
	public static void main(String[] args) throws IOException {

		FileReader f_1=new FileReader("LoginUsername.txt");
		BufferedReader br_1=new BufferedReader(f_1);
		
		FileReader f_2=new FileReader("LoginUserpass.txt");
		BufferedReader br_2=new BufferedReader(f_2);
		
		String line_1=br_1.readLine();
		String line_2=br_2.readLine();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username : ");
		String un=sc.nextLine();
		System.out.println("Enter password : ");
		String pw=sc.nextLine();
		
		while(un.equals(line_1)==false) {
			line_1=br_1.readLine();
			line_2=br_2.readLine();
			//System.out.println("Please check your username!!");
			
			if(un.equals(line_1) && pw.equals(line_2))
			{
				System.out.println("Login Successful");
				break;
			}
			else 
			{
				System.out.println("Login Failed");
				break;
			}	
		}
		
		
		
	}
}
