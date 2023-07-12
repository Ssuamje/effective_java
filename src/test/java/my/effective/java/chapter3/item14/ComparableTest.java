package my.effective.java.chapter3.item14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ComparableTest {

	//compareTo의 반환 타입은 int이다.
	private static final int TRUE = 0;

	@Test
	void Comparable_테스트() {
		ComparablePhoneNumber sameNumber = new ComparablePhoneNumber("010", "1234", "5678");
		ComparablePhoneNumber anotherSameNumber = new ComparablePhoneNumber("010", "1234", "5678");
		ComparablePhoneNumber diffNumber = new ComparablePhoneNumber("010", "1234", "5679");

		/*-----------------------------------기본 필드 비교------------------------------------------*/
		assertEquals(TRUE, sameNumber.compareTo(anotherSameNumber));
		assertNotEquals(TRUE, sameNumber.compareTo(diffNumber));
		/*---------------------------비교자 생성 메서드 - 내부 비교자를 이용-------------------------------*/
		assertEquals(TRUE, sameNumber.compareToByComparator(anotherSameNumber));
		assertNotEquals(TRUE, sameNumber.compareToByComparator(diffNumber));
		/*--------------------------------정적 compare 메서드를 이용-----------------------------------*/
		assertEquals(TRUE, ComparablePhoneNumber.hashCodeOrder.compare(sameNumber, anotherSameNumber));
		assertNotEquals(TRUE, ComparablePhoneNumber.hashCodeOrder.compare(sameNumber, diffNumber));
	}
}
