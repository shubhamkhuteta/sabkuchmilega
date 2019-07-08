package encapsulationexample;

/**
 * @author skhuteta
 *
 */

public class EncapsulationTest 
{	
	public static void main(String[] args) 
	{
		EmployeeClass emp=new EmployeeClass();
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsal());
	}
}
