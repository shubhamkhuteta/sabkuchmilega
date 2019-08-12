package collectionexample;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeTest implements Comparable{
	String name;
	int id;
	boolean passed;
	
	EmployeeTest(String name, int id, boolean passed){
		
		this.name=name;
		this.id=id;
		this.passed=passed;
	}

	@Override
	public String toString() {
		return name+"**"+id+"**"+passed;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int id1=this.id;
		EmployeeTest e=(EmployeeTest)o;
		int id2=e.id;
		if(id1<id2) {
			return -1;
		}
		else if(id1>id2) {
			return 1;
		}else
		return 0;
	}
	
	
}

class EmployeeTest2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeTest emp1=(EmployeeTest)o1;
		EmployeeTest emp2=(EmployeeTest)o2;
		
		String s1=emp1.name;
		String s2=emp2.name;
		
		return s1.compareTo(s2);
	}
	
}


public class TreeSet_Comparable {
	public static void main(String[] args) {
		EmployeeTest e1=new EmployeeTest("shubham",52,true);
		EmployeeTest e2=new EmployeeTest("raghav",62,false);
		EmployeeTest e3=new EmployeeTest("apankaj",22,false);
		EmployeeTest e4=new EmployeeTest("harshit",15,true);
		
		TreeSet ts=new TreeSet();
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		
		System.out.println(ts);
		
		TreeSet ts2=new TreeSet(new EmployeeTest2());
		
		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);
		
		System.out.println(ts2);
	}
}
