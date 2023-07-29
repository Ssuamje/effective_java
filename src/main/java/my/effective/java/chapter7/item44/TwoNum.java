package my.effective.java.chapter7.item44;

import lombok.AllArgsConstructor;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

@AllArgsConstructor
public class TwoNum {
	private int x;
	private int y;

	public int operatedBy(IntBinaryOperator operator) {
		return operator.applyAsInt(x, y);
	}

	public void doXTimes(IntConsumer print) {
		for (int i = 0; i < x; i++) {
			print.accept(x);
		}
	}

	public void doGenericLambda(Consumer<String> string) {
		string.accept("HI!");
	}
}
