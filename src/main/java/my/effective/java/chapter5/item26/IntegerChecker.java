package my.effective.java.chapter5.item26;

public class IntegerChecker implements Checker<Integer> {
	@Override
	public boolean isLarge(Integer item) {
		return item > 100;
	}

	@Override
	public boolean isItemCorrect(Box<?> box, Class<Integer> clazz) {
		return clazz.isInstance(box.unbox());
	}
}

