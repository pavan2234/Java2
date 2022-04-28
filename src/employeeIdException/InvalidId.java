package employeeIdException;

public class InvalidId extends Exception{
	InvalidId(){
		System.err.println("Given Employee ID is not found or mismatched ,\r\n"
				+ "please enter the valid ID");
	}

}
