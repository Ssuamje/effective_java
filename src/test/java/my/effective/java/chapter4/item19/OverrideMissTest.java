package my.effective.java.chapter4.item19;

import org.junit.jupiter.api.Test;

public class OverrideMissTest {

	@Test
	void 오버라이드_테스트() {
		InferClass inferClass = new InferClass("삼천갑자 동방삭", 180000);
		// 예상 : 안녕하세요. 저는 삼천갑자 동방삭인데요, 제 나이는 180000입니다.
		// 실제 : 안녕하세요. 저는 삼천갑자 동방삭인데요, 제 나이는 null입니다.
	}
}
