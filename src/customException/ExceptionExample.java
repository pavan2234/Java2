package customException;

public class ExceptionExample {
	static void validate(int age) throws InvalidException{
		if(age<18) {
			throw new InvalidException("age is not valid to vote");  
			}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		try {
			validate(12);
		}
		catch(InvalidException e){
			System.out.println("Exception Handled"+e);
			
		}
		finally {
			System.out.println("End of the program");
		}
	

	}

}
