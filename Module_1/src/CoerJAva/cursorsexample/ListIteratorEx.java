package cursorsexample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		
		ArrayList dayNames = new ArrayList();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Sunday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Sunday");
		System.out.println(dayNames);
		
		ListIterator days=dayNames.listIterator();
		
		while(days.hasNext()) 
		{
			String str=(String) days.next();
			if(str.equals("Sunday"))
			{
				days.set("Shubham");
				System.out.println(days.next());
				days.previous();
			}
			//System.out.println(days.next()+" ");
			else
			{
				System.out.println(""+str+" ");
			}
		}
		
		/*while(days.hasPrevious())
		{
			if(dayNames2.contains(dayNames)) {
				System.out.println("hELLO");
				days.set("Shubham");
			}
			else {
				System.out.println(days.previous()+" ");
			}
		}*/
	}
}
