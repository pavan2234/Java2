package enumExamples;

public class EnumExample {
	enum Mobile{
		APPLE,SAMSUNG,HTC;
		int price;
	
		Mobile(){
			price = 80;
			System.out.println("Constructor");
			}
}
	public static void main(String[] args) {
	Mobile m[] = Mobile.values();
	for(Mobile mobile:m) {
		System.out.println(mobile);
	}
	}

}

