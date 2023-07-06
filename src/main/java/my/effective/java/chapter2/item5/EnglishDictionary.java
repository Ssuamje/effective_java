package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EnglishDictionary implements Dictionary {

	private static final EnglishDictionary INSTANCE = new EnglishDictionary();
	private static final String hello = "Hello";
	private static final String bye = "Goodbye";
	private static final Language language = Language.ENGLISH;

	public static EnglishDictionary getInstance() {
		return INSTANCE;
	}

	@Override
	public void hello() {
		System.out.println(hello);
	}

	@Override
	public void bye() {
		System.out.println(bye);
	}

	@Override
	public boolean isFrom(Language language) {
		return EnglishDictionary.language.equals(language);
	}
}
