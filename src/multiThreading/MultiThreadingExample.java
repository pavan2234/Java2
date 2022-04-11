package multiThreading;

public class MultiThreadingExample {

	public static void main(String[] args) {
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();

	}

}
