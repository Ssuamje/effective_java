package my.effective.java.chapter4.item17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ImmutableTest {

	@Test
	void 불변_클래스() {
		Immutable immutable = new Immutable("name", "address", 0, InstanceOnHeap.of(0));
		assertEquals(0, immutable.getCount());
		assertEquals(0, immutable.getMutableCountDefensively().getCount());
		InstanceOnHeap defensive = immutable.getMutableCountDefensively();
		InstanceOnHeap defensive2 = immutable.getMutableCountDefensively(); // 방어적 복사(스냅샷)이기 때문에 다른 인스턴스다.
		assertNotEquals(defensive.hashCode(), defensive2.hashCode());
	}

	@Test
	void 동반_클래스() {
		Car car = CarFactory.createCar("maker", "model", 2021);
		Car car2 = CarFactory.createCar("maker", "model", 2021);
		assertEquals(car, car2);
	}
}
