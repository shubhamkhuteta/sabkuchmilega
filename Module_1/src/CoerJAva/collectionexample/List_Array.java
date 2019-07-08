package collectionexample;

import java.util.ArrayList;
import java.util.Comparator;

class Employee implements Comparator{
	private int id=0;
	private String name=null;
	
	Employee(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Id :" +id+" Name : "+name;
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class List_Array {
	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee(1230,"Shubham");
		Employee e2 = new Employee(1234,"Puran");
		Employee e3 = new Employee(1239,"Raghav");
		Employee e4 = new Employee(1236,"Sanskar");
		
		ArrayList al=new ArrayList();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println(al);
	}
}
