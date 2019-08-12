package collectionexample;

import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		//to add the element
		v.addElement("Shubham");
		System.out.println(v);
		
		//to get the size of the vector
		System.out.println(v.size());
		
		//v.elementAt(1);
		System.out.println(v.elementAt(0));
		
		System.out.println(v.capacity());
		
	}
}
