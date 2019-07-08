package collectionexample;

import java.util.LinkedList;

public class List_LinkedList {
	public static void main(String[] args) {
		//Array list with HATEROGENIOUS VALUES
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
				
		ll1.add("Shubhma");
		ll1.add(12314);
		ll1.add('a');
		
		ll1.size();
		ll2.addLast("ShubhamKhuteta");
		ll2.addAll(ll1);
		ll2.addFirst("ShubhamSharma");
		ll2.removeLast();
		//ll2.clear();
		//ll2.clone();
		
		
		System.out.println(ll2);
		System.out.println(ll2.containsAll(ll1));
		
		//ll2.containsAll("ShubhamKhuteta","ShubhamSharma");
		System.out.println("Iterator Example");
		//System.out.println(ll2.descendingIterator());
		System.out.println(ll2.isEmpty());
		
		System.out.println(ll2.peek());
		//System.out.println(ll2.);
		System.out.println(ll2.remove());
		
		
		System.out.println(ll2.contains(ll1));
		
		System.out.println(ll2.getFirst());
		
				
		System.out.println(ll1);
		

	}
}
