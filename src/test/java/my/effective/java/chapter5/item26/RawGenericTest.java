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
		Box<Integer> box = new Box<>(1);
		Checker<Integer> checker = new IntegerChecker();

		assertThat(checker.isEmpty(box)).isFalse();
		assertThat(checker.isLarge(box.unbox())).isFalse();
	}

}
