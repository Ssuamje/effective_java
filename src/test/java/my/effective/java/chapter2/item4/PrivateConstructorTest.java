package my.effective.java.chapter2.item4;

import org.junit.jupiter.api.Test;

public class PrivateConstructorTest {

	@Test
	void 생성자_막기() {
		// PrivateConstructorExample privateConstructorExample = new PrivateConstructorExample(); <- 안 됨
		System.out.println("PrivateConstructorExample.getName() = " + PrivateConstructorExample.getName());
		// "개인정보입니다만?"
	}
}
