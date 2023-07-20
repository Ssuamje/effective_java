package my.effective.java.chapter5.item26;

public class Box<T> {
	private final T something;

	public Box(T something) {
		this.something = something;
	}

	public T unbox() {
		return something;
	}
}
