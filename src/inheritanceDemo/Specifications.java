package inheritanceDemo;
import java.util.*;
public class Specifications extends Vehicle {
	int CC;
	String Color;
	Specifications(int CC, String Color) {
		super(CC, Color);
		this.CC=CC;
		this.Color=Color;
		System.out.println(CC);
		System.out.println(Color);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int reg = sc.nextInt();
		String mdl = sc.nextLine();
		int CC = sc.nextInt();
		String Color = sc.nextLine();
		Specifications s = new Specifications(sc.nextInt(),sc.nextLine());

	}

}
