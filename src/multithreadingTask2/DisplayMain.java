package multithreadingTask2;

public class DisplayMain {
	public static void main(String[] args) throws InterruptedException {
		Add addition = new Add();
		Average average = new Average();
		Display display = new Display();
		addition.start();
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			System.out.println(e);
		}
		average.start();
		addition.join();
		average.join();
		display.start();
	}

}
