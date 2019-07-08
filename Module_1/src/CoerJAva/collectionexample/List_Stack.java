package collectionexample;

import java.util.Stack;


public class List_Stack {
	public static void main(String[] args) {
		Stack ll1 = new Stack();
		Stack ll2 = new Stack();
				
		ll1.add("Shubhma");
		ll1.add(12314);
		ll1.add('a');
		ll1.size();
		
		System.out.println(ll2);
		System.out.println(ll2.containsAll(ll1));
		System.out.println("Iterator Example");
		System.out.println(ll2.isEmpty());
		System.out.println(ll2.contains(ll1));
		System.out.println(ll1);
		System.out.println(ll2);
	}
}
