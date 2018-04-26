package pksoft;
import java.util.*;
public class first  { 
	// the 
public static void main(String[] args) { 

	// Priority
	PriorityQueue<String> pq = new PriorityQueue<String>();
	
	pq.offer("Ram Lal");
	pq.offer("Hary Kafle");
	// Priority according to the alphabetical orders
	// proraty is given to Mr. Hary Kafle because due to the alphabetical orders.
	pq.offer("Shayam Pokhrel");
	System.out.printf("%s ", pq);;
	System.out.println();
	System.out.printf("%s ", pq.peek());
	
	System.out.println();
	pq.poll();
	System.out.printf("%s ", pq);
	
   }
}

