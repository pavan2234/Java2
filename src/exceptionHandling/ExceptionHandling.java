package exceptionHandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		 try  
	        {  
	        int data=50/0; //may throw exception   
	         
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	         
	        }
		 	finally {
	          System.out.println("rest of the code");
		 	}
	}

}
