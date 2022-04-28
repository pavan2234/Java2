package daemonThread;

public class Thread1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Pavan");
		}else {
			System.out.println("Thread1");
		}
	}
}
