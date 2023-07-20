package my.effective.java.chapter5.item26;

public interface Checker<T> {
	default boolean isEmpty(Box<?> box) {
		return box.unbox() == null;
	}

	boolean isLarge(T item);
}
