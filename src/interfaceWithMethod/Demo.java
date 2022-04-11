package interfaceWithMethod;

public interface Demo {
	default void name() {
		System.out.println("Using Default");
	}
}
