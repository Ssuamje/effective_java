package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class FactoryBot {
	private final Dictionary dictionary;

	public static FactoryBot of(Language language) {
		if (language.equals(Language.KOREAN)) {
			return new FactoryBot(KoreanDictionary.getInstance());
		}
		if (language.equals(Language.ENGLISH)) {
			return new FactoryBot(EnglishDictionary.getInstance());
		}
		if (language.equals(Language.SPANISH)) {
			return new FactoryBot(new CreatableSpanishDictionary());
		}
		throw new IllegalArgumentException("지원하지 않는 언어입니다.");
	}

	public void sayHello() {
		dictionary.hello();
	}

	public void sayBye() {
		dictionary.bye();
	}
}
