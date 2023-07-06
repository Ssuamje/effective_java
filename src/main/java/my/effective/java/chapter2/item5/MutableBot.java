package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MutableBot {
	private static final MutableBot INSTANCE = new MutableBot();

	private static Dictionary dictionary;

	public static MutableBot getInstance() {
		return INSTANCE;
	}

	public static void changeDictionary(Dictionary dictionary) {
		MutableBot.dictionary = dictionary;
	}

	public void sayHello() {
		if (dictionary == null) {
			throw new IllegalStateException("사전을 먼저 선택해주세요.");
		}
		dictionary.hello();
	}

	public void sayBye() {
		if (dictionary == null) {
			throw new IllegalStateException("사전을 먼저 선택해주세요.");
		}
		dictionary.bye();
	}
}
