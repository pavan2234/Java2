package constructor;

public class Relation {
	String Name;
	String Relation;
	Relation(String Name,String Relation){
		this.Name = Name;
		this.Relation = Relation;
	}
	public static void main(String[] args) {
		Relation A = new Relation("Pavan","Brother");
		Relation B = new Relation("Prashanth","Neighbhour");
		System.out.println(A.Name+" "+A.Relation);
		System.out.println(B.Name+" "+B.Relation);
	}

}
