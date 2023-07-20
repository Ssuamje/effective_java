package my.effective.java.chapter5.item26;

public interface Checker<T> {
	default boolean isEmpty(Box<?> box) {
		return box.unbox() == null;
	}

	default boolean isCoincident(Box<?> box, Class<T> clazz) {
		return clazz.isInstance(box.unbox());
	}

	boolean isLarge(T item);
}
