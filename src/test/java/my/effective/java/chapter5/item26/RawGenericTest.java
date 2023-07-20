package my.effective.java.chapter5.item26;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RawGenericTest {
	public static void printList(List<String> list) {
		for (String elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	@Test
	void Raw_제네릭() {

		List rawList = new ArrayList();
		rawList.add("Raw");
		rawList.add(1);

		assertThatThrownBy(() -> {
			printList(rawList);
		}).isInstanceOf(ClassCastException.class);
	}

	@Test
	void 제네릭() {
		Box<Integer> integerBox = new Box<>(1);
		Box<String> stringBox = new Box<>("hi");
		Checker<Integer> checker = new IntegerChecker();

		assertThat(checker.isEmpty(integerBox)).isFalse();
		assertThat(checker.isCoincident(integerBox, Integer.class)).isTrue();
		assertThat(checker.isCoincident(stringBox, Integer.class)).isFalse();
		assertThat(checker.isLarge(integerBox.unbox())).isFalse();
	}

}
