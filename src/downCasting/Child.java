package downCasting;

public class Child extends Parent{
	public static void example(Parent p) {
		if(p instanceof Child) {
			Child c = (Child)p;
			System.out.println("Downcasting is succeded");
		}
	}
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child)p;
		Child.example(p);
		

	}

}
