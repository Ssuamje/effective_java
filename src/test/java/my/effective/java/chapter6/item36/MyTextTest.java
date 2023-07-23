package my.effective.java.chapter6.item36;

import org.junit.jupiter.api.Test;

class MyTextTest {

	@Test
	void 오버라이드() {
		Animal catUpperCast = new Cat();
		catUpperCast.bow(); // 야옹
	}

	class Animal {
		public void bow() {
			System.out.println("왕왕");
		}
	}

	class Cat extends Animal {
		@Override
		public void bow() {
			System.out.println("야옹");
		}
	}

}