package my.effective.java.chapter5.item30;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class AllTypeAffordableSingletonSetTest {

	@Test
	void 제네릭_싱글톤_팩터리() {
		Set<String> stringSet = AllTypeAffordableSingletonSet.getInstance();
		Set<Integer> integerSet = AllTypeAffordableSingletonSet.getInstance();

		stringSet.add("hello");
		integerSet.add(123);
		System.out.println("stringSet = " + stringSet);
		// stringSet = [hello, 123]
	}

	@Test
	void 제네릭_메서드() {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		List<Integer> integerList2 = Arrays.asList(4, 5, 6);
		List<String> stringList = Arrays.asList("hello", "world");
		assertThat(GenericMethod.mergeLists(integerList, integerList2))
				.hasSize(6);
	}

}