package multithreading;

public class aromatic implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Java is aromatic");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Error occurred "+e);
			}
		}
	}
}
