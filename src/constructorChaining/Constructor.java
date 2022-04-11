package constructorChaining;

public class Constructor {
		Constructor(){
			this(98);
			System.out.println("Default Constructor");
		}
		Constructor(int x){
			this(5,6);
			System.out.println("Parameterised Constructor "+x);
		}
		Constructor(int x ,int y){
			System.out.println("Adding" + x+y);
		}
		public static void main (String[] args) {
			new Constructor();
		}
}
