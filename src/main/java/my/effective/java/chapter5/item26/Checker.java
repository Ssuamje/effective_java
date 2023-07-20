package my.effective.java.chapter5.item26;

public interface Checker<T> {
	default boolean isEmpty(Box<?> box) {
		return box.unbox() == null;
	}

	default boolean isItemCorrect(Box<?> box, Class<T> clazz) {
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	boolean isLarge(T item);
}
