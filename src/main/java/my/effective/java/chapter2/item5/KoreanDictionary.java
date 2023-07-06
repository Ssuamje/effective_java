package my.effective.java.chapter2.item5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class KoreanDictionary implements Dictionary {

	private static final KoreanDictionary INSTANCE = new KoreanDictionary();
	private static final String hello = "안녕하세요";
	private static final String bye = "안녕히 계세요";
	private static final Language language = Language.KOREAN;

	public static KoreanDictionary getInstance() {
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
		return KoreanDictionary.language.equals(language);
	}
}
