package animalExmpleForPolymorphism;

public class BabyDog extends Dog{
	public void eat() {
		System.out.println("Baby Dog is eating");
	}
	public static void main(String [] args) {
		Animal a1,a2,a3;  
		a1=new Animal();  
		a2=new Dog();  
		a3=new BabyDog();  
		a1.eat();  
		a2.eat();  
		a3.eat();  
		
	}
}
