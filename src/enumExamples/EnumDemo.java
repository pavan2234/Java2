package enumExamples;

public class EnumDemo {
	enum Mobile{
		APPLE,SAMSUNG,HTC;
	}
	public static void main(String[] args) {
		Mobile m = Mobile.APPLE;
		switch(m){
		case APPLE:
		System.out.println("Apple is best");
		break;
		case SAMSUNG:
		System.out.println("Samsung is better");
		break;
		case HTC:
		System.out.println("Htc");
		break;
		}

	}

}
