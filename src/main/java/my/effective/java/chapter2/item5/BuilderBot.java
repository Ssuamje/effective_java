package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.Builder;

public class BuilderBot {
	private final Dictionary dictionary;

	@Builder(access = AccessLevel.PROTECTED)
	public BuilderBot(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public void sayHello() {
		dictionary.hello();
	}

	public void sayBye() {
		dictionary.bye();
	}
}
