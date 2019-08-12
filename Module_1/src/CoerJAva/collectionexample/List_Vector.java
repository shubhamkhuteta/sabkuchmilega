package collectionexample;

import java.util.*;

public class List_Vector {
public static void main(String[] args) {
	//Array list with HATEROGENIOUS VALUES
			Vector ll1 = new Vector();
			Vector ll2 = new Vector();
					
			ll1.add("Shubhma");
			ll1.add(12314);
			ll1.add('a');
			
			ll1.size();
	
			//ll2.addFirst("ShubhamSharma");
			//ll2.removeLast();
			//ll2.clear();
			//ll2.clone();
			
			
			System.out.println(ll2);
			System.out.println(ll2.containsAll(ll1));
			
			//ll2.containsAll("ShubhamKhuteta","ShubhamSharma");
			System.out.println("Iterator Example");
			//System.out.println(ll2.descendingIterator());
			System.out.println(ll2.isEmpty());
			
			//System.out.println(ll2.peek());
			//System.out.println(ll2.);
			//System.out.println(ll2.remove());
			
			
			System.out.println(ll2.contains(ll1));
			
			//System.out.println(ll2.getFirst());
			
					
			System.out.println(ll1);
}
}
