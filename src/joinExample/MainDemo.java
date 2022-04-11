package joinExample;
public class MainDemo implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++){    
			   try{Thread.sleep(0);}catch(Exception e){System.out.println(e);}    
			  System.out.println(i);    
			  }    
			 }    
public static void main(String [] args) {
	Runnable r = new MainDemo();
	 Thread t1=new Thread(r);    
	 Thread t2=new Thread(r);    
	 Thread t3=new Thread(r);    
	 t1.start();    
	 try{t1.join();}catch(Exception e){System.out.println(e);}    
	 t2.start();    
	 t3.start();    
	 }    
	}    