package my.effective.java.chapter7.item42;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionalTest {

	@Test
	void 함수형_인터페이스_람다() {
		IntegerCalculator integerCalculator = new IntegerCalculator();

		assertThat(integerCalculator.add(1, 2)).isEqualTo(3);
		assertThat(integerCalculator.subtract(1, 2)).isEqualTo(-1);
		assertThat(integerCalculator.multiply(1, 2)).isEqualTo(2);
		assertThat(integerCalculator.divide(1, 2)).isEqualTo(0); // 1/2 -> 0
	}
}
