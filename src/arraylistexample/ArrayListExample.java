package arraylistexample;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("A");
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(str);
		for(String abc:str) {
			System.out.println(abc);
		}

	}

}
