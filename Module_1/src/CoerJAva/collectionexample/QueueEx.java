package collectionexample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		
		q.add("n");
		q.add("z");
		q.add("g");
		q.add("t");
		q.add("b");
		q.add("z");
		
		/*System.out.println(q);
		
		System.out.println(q.element());
		
		System.out.println(q.poll());
		
		System.out.println(q);
		
		System.out.println(q.offer("f"));
		*/
		System.out.println(q);
		
		System.out.println(q.peek());
		
		Iterator itr = q.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
