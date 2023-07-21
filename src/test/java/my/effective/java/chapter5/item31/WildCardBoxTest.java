package my.effective.java.chapter5.item31;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WildCardBoxTest {

	@Test
	void 박스_테스트() {
		WildCardBox<Integer> box1 = new WildCardBox<>(1);
		WildCardBox<Integer> box2 = new WildCardBox<>(2);

		assertThat(box1.compareTo(box2)).isEqualTo(-1);
	}

	@Test
	void SPEC() {
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());

		List<Fruit> fruits = new ArrayList<>();

		WildCardCollection.copyToCollection(apples, fruits);

		WildCardCollection.printCollection(fruits);
//		WildCardCollection.printCollection(apples); 하위 타입이므로 컴파일 에러
	}
}