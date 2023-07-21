package my.effective.java.chapter5.item30;

import java.util.HashSet;
import java.util.Set;

public class AllTypeAffordableSingletonSet {
	private static final Set EMPTY_SET = new HashSet<>();

	@SuppressWarnings("unchecked")
	public static <T> Set<T> getInstance() {
		return (Set<T>) EMPTY_SET;
	}
}
