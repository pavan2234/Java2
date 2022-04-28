package multithreadingTask2;

public class Display extends Thread{
	public void run() {
		for(int k1=0;k1<=1;k1++) {
		System.out.println("Bye");
		try {
		Thread.sleep(50);
		}catch(InterruptedException j) {
		System.out.println(j);
		}
		}
		}
}
