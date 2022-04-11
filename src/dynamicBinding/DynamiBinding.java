package dynamicBinding;

public class DynamiBinding {
	public static void main(String[] args) {
		Person p = new Student();
		p.Drinking();
		Person p1 = new Person();
		p1.Drinking();

	}

}
/*In dynamic binding the compiler doesn't know 
 * which method should be called 
 * so, it takes the reference variable at a run time.
 */