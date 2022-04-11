package interfaceWithMethod;

public class InterfaceWithMethod implements Demo{
	public void name1() {
		System.out.println("In the class");
	}

	public static void main(String[] args) {
		InterfaceWithMethod i = new InterfaceWithMethod();
		i.name();
		i.name1();

	}

}
