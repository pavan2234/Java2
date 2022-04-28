package multithreadingTask2;

public class Add extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Adding Operation");
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
	}
}
