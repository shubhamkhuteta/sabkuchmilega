package collectionexample;

import java.util.*;


public class Set_HashSet {
	public static void main(String[] args) {
		
		//Hash Set(Duplicate value is not allowed & insertion order is preserve)
		HashSet hs = new HashSet();
		
		hs.add(112);
		hs.add("Shubham");
		hs.add(122);
		hs.add(112);
		hs.add(123);
		
		System.out.println("Hash Set : ");
		System.out.println(hs);
		
		//TreeSet(Duplicate value is allowed & insertion order is not preserve)
		TreeSet ts = new TreeSet();
		
		ts.add(112);
		ts.add(1222);
		ts.add(1225);
		ts.add(142);
		ts.add(123);
		
		System.out.println("Tree Set : ");
		System.out.println(ts);
		
		//Linked HashSet(Duplicate value is not allowed & insertion order is preserve)
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(112);
		lhs.add(1222);
		lhs.add(122);
		lhs.add(112);
		lhs.add(123);
		
		System.out.println("Linked HashSet : ");
		System.out.println(lhs);
		
	}
}
