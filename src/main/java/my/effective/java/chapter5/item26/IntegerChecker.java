package my.effective.java.chapter5.item26;

public class IntegerChecker implements Checker<Integer> {
	@Override
	public boolean isLarge(Integer item) {
		return item > 100;
	}
}

