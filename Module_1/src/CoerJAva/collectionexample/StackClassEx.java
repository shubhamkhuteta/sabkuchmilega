package collectionexample;

import java.util.Stack;

public class StackClassEx {
	public static void main(String[] args) {
		Stack s= new Stack();
		
		s.add("Shubham");
		
		System.out.println(s);
		System.out.println(s.push("ShubhamKhuteta"));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.push("ShubhamKhuteta"));
		System.out.println(s.peek());
		System.out.println(s.elementAt(1));
		System.out.println(s.remove(0));
		s.add("Shubham");
		s.add("ShubhamK");
		s.add("ShubhamKh");
		s.add("ShubhamKhu");
		s.add("ShubhamKhut");
		System.out.println(s);
		System.out.println(s.search("ShubhamK"));
		s.insertElementAt("Sanskar Modi", 2);
		System.out.println(s);
		


	}
}
