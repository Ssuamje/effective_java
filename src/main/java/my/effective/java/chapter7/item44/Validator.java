package my.effective.java.chapter7.item44;

@FunctionalInterface
public interface Validator<T> {
	boolean isValid(T t);
}
