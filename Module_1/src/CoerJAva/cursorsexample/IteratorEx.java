package cursorsexample;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class IteratorEx {
	public static void main(String[] args) {
		int i = 0;
		ArrayList dayNames = new ArrayList();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Sunday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Sunday");
		System.out.println(dayNames);
		
		Iterator days=dayNames.iterator();
		
		while(days.hasNext()) {
			String ans=(String)days.next();
			if(ans.equals("Sunday"))
			{
				days.remove();
			}
			else {
				i++;
				System.out.println(i+"Elements are :"+ans);
			}
			
		}
	}
}
