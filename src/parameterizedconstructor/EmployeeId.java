package parameterizedconstructor;

public class EmployeeId {
	int id;
	String Name;
	EmployeeId(int id,String Name){
		this.id = id;
		this.Name = Name;
	}
	public static void main(String[] args) {
		EmployeeId e1 = new EmployeeId(123,"Ram");
		EmployeeId e2 = new EmployeeId(456,"Surya");
		System.out.println(e1.id + " " + e1.Name);
		System.out.println(e2.id + " " + e2.Name);
	}

}
