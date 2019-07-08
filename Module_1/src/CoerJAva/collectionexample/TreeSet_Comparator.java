package collectionexample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Comparator {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String> (new MyComparator() {});
		
		ts.add("a");
		ts.add("c");
		ts.add("g");
		ts.add("b");
		ts.add("f");
		ts.add("e");
		
		System.out.println(ts);
	}
}

abstract class MyComparator implements Comparator{

	public int compare(Object o1,Object o2) {
		//Integer int1=(Integer)o1;
		//Integer int2=(Integer)o2;
		
		String str1=o1.toString();
		String str2=o2.toString();
		/*if(int1<int2) {
			return +10000;
		}else if(int1>int2) {
			return -10000;
		}*/
		
		return -str1.compareTo(str2);
		//return int1.compareTo(int2);
	}
}