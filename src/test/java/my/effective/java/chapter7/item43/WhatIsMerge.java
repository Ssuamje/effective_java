package my.effective.java.chapter7.item43;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.BiFunction;

import static org.assertj.core.api.Assertions.assertThat;

public class WhatIsMerge {

	@Test
	void 메서드_참조와_람다() {
		// 정적
		BiFunction<String, Integer, Integer> parseIntMethod = Integer::parseInt;
		BiFunction<String, Integer, Integer> parseIntLambda = (s, radix) -> Integer.parseInt(s, radix);
		int arithmetic = 10;
		String intString = "2147";
		assertThat(parseIntMethod.apply(intString, arithmetic)).isEqualTo(2147);
		assertThat(parseIntLambda.apply(intString, arithmetic)).isEqualTo(2147);
	}

	@Test
	void 맵_머지가_머지() {
		// Map 자체는 변경 가능성에 대해 아무 것도 가정하지 않는다 - 인터페이스이기 때문에.
		// 즉, Map 인터페이스는 변경 가능한 맵에도, 불변의 맵에도 사용될 수 있는 메서드 세트를 정의한다.
		// 불변의 맵은 'put', 'remove' 등의 변경 연산이 호출되면 UnsupportedOperationException을 던진다.
		// 아래의 경우 Map.of만 사용하게 되면 '불변처럼'되기 때문에, 가변가능한 HashMap으로 래핑해야 한다.
		Map<String, Number> map = new java.util.HashMap<>(Map.of("a", 1, "b", 2, "c", 3));

		// value는 비록 현재 코드에서는 3L Long이지만 merge의 value는 Number이므로
		// merge가 사용하는 람다 표현식 내부에서는 Number(V 타입)로 사용된다 -> intValue()로 변환해야 한다.
		// 결과는 int 밸류에 대한 덧셈이지만, int를 박싱한 Integer가 반환된다.
		assertThat(map.merge("a", 3L, (oldValue, value) -> oldValue.intValue() + value.intValue()))
				.isInstanceOf(Integer.class); // Integer는 Number의 자식이기에, Number.class를 해도 성공한다.

		assertThat(map.get("a")).isEqualTo(4);

		Map<String, Integer> integerMap = new java.util.HashMap<>(Map.of("a", 1, "b", 2, "c", 3));
		assertThat(integerMap.merge("b", 100, Integer::sum)).isEqualTo(102);

	}
}
