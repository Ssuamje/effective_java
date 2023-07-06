package my.effective.java.chapter2.item4;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PrivateConstructorExample {
	private static final String name = "개인정보입니다만?";
	private static final Integer age = 7;

	public static String getName() {
		return name;
	}
}

