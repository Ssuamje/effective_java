package my.effective.java.chapter3.item10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EqualsTest {

	@Test
	void equals_오버라이드() {
		/*----------------------------------다른 레퍼런스-----------------------------------*/
		Reference 서울사는_정상수 = new Reference("정상수");
		Reference 부산사는_정상수 = new Reference("정상수");
		assertNotEquals(서울사는_정상수, 부산사는_정상수); // Equals !Override && 다른 인스턴스
		/*----------------------------------모든 프로퍼티에 대한 equals-----------------------------------*/
		Bundle 계란_한판 = new Bundle("계란", 10000, 30);
		Bundle 계란_한판_유통기한_지남 = new Bundle("계란", 10000, 30);
		assertEquals(계란_한판, 계란_한판_유통기한_지남); // 같은 프로퍼티인 경우에 대한 Equals Override
		/*----------------------------------특정 프로퍼티에 대한 equals-----------------------------------*/
		Entity 정상수 = new Entity(1, "정상수", 30);
		Entity 정상수_런타임_중_나이먹음 = new Entity(1, "정상수", 31);
		assertEquals(정상수, 정상수_런타임_중_나이먹음); // 특정 프로퍼티인 경우에 대한 Equals Override
	}
}
