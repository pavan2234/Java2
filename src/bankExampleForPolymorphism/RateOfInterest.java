package bankExampleForPolymorphism;

public class RateOfInterest {

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("SBI is "+b.getRateOfInterest());
		b = new HDFC();
		System.out.println("HDFC is "+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI is "+b.getRateOfInterest());

	}

}
