package employeeIdException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EmployeeId {
	Map<Integer,String> name = new HashMap<Integer,String>();
	Map<Integer,String> address = new HashMap<Integer,String>();
	public void entry() {	
		try {
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			if(name.containsKey(id)) {
				System.out.println("Id validated successfully");
			}else {
				throw new InvalidId();
			}
			System.out.println("----Welcome to the Office----");
			System.out.println(name.get(id)+"--"+address.get(id));
			sc.close();
		}catch(InvalidId e) {
			entry();
		}
	}
}
