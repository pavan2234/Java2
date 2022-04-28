package multithreadingTask2;

public class Average extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
		System.out.println("Average operation");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}
