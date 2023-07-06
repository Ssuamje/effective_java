package my.effective.java.chapter2.item5;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConstructorBot {
	private final Dictionary dictionary;

	public void sayHello() {
		dictionary.hello();
	}

	public void sayBye() {
		dictionary.bye();
	}
}
