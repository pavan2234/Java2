package runTimePolymorphism;

public class Splendor extends Bike{
	void run() {
		System.out.println("Bike is running at 60km");
	}
	public static void main(String[]args) {
		Bike b = new Splendor();
		b.run();
	}

}
