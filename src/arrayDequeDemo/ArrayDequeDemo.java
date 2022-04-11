package arrayDequeDemo;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		

	}

}
