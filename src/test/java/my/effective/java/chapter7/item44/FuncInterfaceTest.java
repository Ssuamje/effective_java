package my.effective.java.chapter7.item44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FuncInterfaceTest {

	@DisplayName("함수형 인터페이스 매개변수로 람다 익명 구현 객체(함수)를 주입할 수 있다.")
	@Test
	void eokjiDomain() {
		DomainEntity domain = new DomainEntity("domain", s -> !s.isEmpty());
		DomainEntity emptyDomain = new DomainEntity("", s -> !s.isEmpty());

		assertThat(domain.isValid()).isTrue();
		assertThat(emptyDomain.isValid()).isFalse();
	}

	@DisplayName("IntBinaryOperator 기본 인터페이스를 이용해서 int 값을 갖는 두 개의 매개변수를 받아서 연산을 수행할 수 있다.")
	@Test
	void twoNum() {
		TwoNum twoNum = new TwoNum(3, 2);
		int sum = twoNum.operatedBy((x, y) -> x + y);
		int multiply = twoNum.operatedBy((x, y) -> x * y);

		assertThat(sum).isEqualTo(5);
		assertThat(multiply).isEqualTo(6);

		// twoNum의 x의 값 만큼 void를 반환하는 람다 표현식을 수행한다. - IntConsumer
		twoNum.doXTimes(times -> System.out.println("HELLO!"));
		//HELLO!
		//HELLO!
		//HELLO!

		twoNum.doGenericLambda(System.out::println);
		// HI!
	}
}
