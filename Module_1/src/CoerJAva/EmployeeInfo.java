import java.util.Scanner;

public class EmployeeInfo 
{
	static String empName;
	static int empId;
	static int empSal;
	
	public static void main(String args[])
	{
		System.out.println("*************Welcome to Capgemini*************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name:");
		empName=sc.nextLine();
		System.out.println("Enter your Employee ID:");
		empId=sc.nextInt();
		System.out.println("Enter your Salary:");
		empSal=sc.nextInt();
		
		System.out.println("*************Here is the details you entered************");
		System.out.println("Name: "+empName+"\nYour Emp ID: "+empId+"Your Salary: "+empSal);
	}
	
}
