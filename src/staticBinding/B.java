package staticBinding;

public class B extends A{
	
	public static void main(String[] args) {
		A obj = new A();
		obj.Read();
		A obj1 = new B();
		obj1.Read();

	}

}
