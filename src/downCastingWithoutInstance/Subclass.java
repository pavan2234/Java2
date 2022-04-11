package downCastingWithoutInstance;

public class Subclass extends SuperClass{
	public static void example(SuperClass S) {
	
		Subclass C = (Subclass)S;
	     System.out.println("ok downcasting performed");  
	}
	public static void main(String[]args) {
		SuperClass S = new Subclass();
		Subclass.example(S);
	}

}
