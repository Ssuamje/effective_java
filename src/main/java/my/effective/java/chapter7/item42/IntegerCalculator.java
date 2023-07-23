package my.effective.java.chapter7.item42;

public class IntegerCalculator {
	public Integer add(Integer a, Integer b) {
		return Operand.PLUS.apply(a, b);
	}

	public Integer subtract(Integer a, Integer b) {
		return Operand.MINUS.apply(a, b);
	}

	public Integer multiply(Integer a, Integer b) {
		return Operand.TIMES.apply(a, b);
	}

	public Integer divide(Integer a, Integer b) {
		return Operand.DIVIDE.apply(a, b);
	}

	enum Operand {
		PLUS("+", (a, b) -> a + b),
		MINUS("-", (a, b) -> a - b),
		TIMES("*", (a, b) -> a * b),
		DIVIDE("/", (a, b) -> a / b),
		;

		private final String symbol;
		private final MyOperator<Integer> operator;

		Operand(String symbol, MyOperator<Integer> operator) {
			this.symbol = symbol;
			this.operator = operator;
		}

		public int apply(int a, int b) {
			return operator.apply(a, b);
		}

		@Override
		public String toString() {
			return symbol;
		}

		public Operand fromString(String symbol) {
			for (Operand operand : values()) {
				if (operand.symbol.equals(symbol)) {
					return operand;
				}
			}
			throw new IllegalArgumentException();
		}
	}
}
