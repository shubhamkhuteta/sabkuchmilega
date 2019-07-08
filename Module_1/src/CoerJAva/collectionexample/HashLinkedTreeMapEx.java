package collectionexample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashLinkedTreeMapEx {
	public static void main(String[] args) {
		
		System.out.println("Hash Map Values : \n");
		HashMap hm = new HashMap();
		hm.put(1, "Shubham");
		hm.put(2, "Raghav");
		hm.put(3, "Pankaj");
		hm.put(4, "Sanskar");
		hm.put(5, "Shubham");
		hm.put(5, "Sanskar");
		System.out.println("---------Various Operations--------");
		System.out.println("Contains key : "+hm.containsKey(9));
		System.out.println("Contains value : "+hm.containsValue("Pankaj"));
		System.out.println("Getting value of a key : "+hm.get(2));
		System.out.println("Getting key of a value : "+hm.get("Shubham"));
		System.out.println("All the values"+hm.values());
		System.out.println("All the keys : "+hm.keySet());
		System.out.println("Entry set : "+hm.entrySet());
		System.out.println("Empty or not : "+hm.isEmpty());
		//System.out.println("Remove key and value : "+hm.remove(2, "Raghav"));
		System.out.println(hm.replace(2, "Bhushan"));
		System.out.println(hm.replace(3, "Pankaj", "Parewa"));
		System.out.println("---------Final Output--------");
		System.out.println(hm);
		
		System.out.println("\n\nLinked Hash Map Values : \n");
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(5, "Shubham");
		lhm.put(8, "Raghav");
		lhm.put(1, "Pankaj");
		lhm.put(14, "Sanskar");
		lhm.put(50, "Shubham");
		lhm.put(51, "Sanskar");
		
		
		System.out.println(lhm);
		
		System.out.println("\n\nTree Map Values : \n");
		TreeMap tm = new TreeMap();
		tm.put(5, "Shubham");
		tm.put(8, "Raghav");
		tm.put(1, "Pankaj");
		tm.put(14, "Sanskar");
		tm.put(50, "Shubham");
		tm.put(51, "Sanskar");
		System.out.println(tm);
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.higherKey(9));
		System.out.println(tm.firstKey());
		System.out.println(tm.ceilingKey(5));
		System.out.println(tm);
	}
}
