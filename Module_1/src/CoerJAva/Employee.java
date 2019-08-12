
public class Employee {

	static int depId=8256;
	String orgName="Capgemini";
	
	public static void main(String[] args) {
		
		String empName=args[0];
		int empId=Integer.parseInt(args[1]);
		int empSal=Integer.parseInt(args[2]);
		
		System.out.println(empName+" "+empId+" "+empSal);
		
		System.out.println(Employee.depId);
		
		Employee emp = new Employee();
		
		System.out.println(emp.orgName);
	}
}
