package cursorsexample;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationEx {
	public static void main(String[] args) {
		int i = 0;
		Stack dayNames = new Stack();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		System.out.println(dayNames);
		
		Enumeration days= dayNames.elements();
		
		while(days.hasMoreElements()) {
			System.out.println(i+" Value is : "+days.nextElement());
			i++;
		}
	}
}
