package collectionexample;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class EmployeeTest_1 implements Comparator{
	String name;
	int id;
	boolean passed;
	
	EmployeeTest_1(String name, int id){
		
		this.name=name;
		this.id=id;
	
	}

	@Override
	public String toString() {
		return name+"**"+id+"**";
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

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class EmployeeTest_3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeTest_1 emp1=(EmployeeTest_1)o1;
		EmployeeTest_1 emp2=(EmployeeTest_1)o2;
		
		String s1=emp1.name;
		String s2=emp2.name;
		
		return s1.compareTo(s2);
	}
	
}


public class HashExampleSort {
	public static void main(String[] args) {
	
		TreeMap tm=new TreeMap(new EmployeeTest_1(null, 0));
		
		tm.put(1,"Shubham");
		tm.put(4,"ShubhamK");
		tm.put(2,"ShubhamKh");
		tm.put(3,"ShubhamKhu");
		
		System.out.println(tm);
		tm.keySet();
		
		Set s=tm.entrySet();
		Iterator itr =s.iterator();
		
		while(itr.hasNext()) {
			java.util.Map.Entry e=(java.util.Map.Entry)itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
