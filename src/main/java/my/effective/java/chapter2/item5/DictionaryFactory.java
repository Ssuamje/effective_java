package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DictionaryFactory {
	private static final DictionaryFactory INSTANCE = new DictionaryFactory();

	public static DictionaryFactory getInstance() {
		return INSTANCE;
	}

	public CreatableSpanishDictionary createSpanishDictionary() {
		return new CreatableSpanishDictionary();
	}

	public KoreanDictionary getKoreanDictionary() {
		return KoreanDictionary.getInstance();
	}

	public EnglishDictionary getEnglishDictionary() {
		return EnglishDictionary.getInstance();
	}
}
