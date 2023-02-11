
@FunctionalInterface
public interface Browser {
	void browser();
	default void play() {
		System.out.println("Browser Media Player");
		
	}
}
