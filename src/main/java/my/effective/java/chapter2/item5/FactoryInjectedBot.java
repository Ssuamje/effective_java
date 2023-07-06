package my.effective.java.chapter2.item5;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FactoryInjectedBot {

	private final DictionaryFactory dictionaryFactory;
	private Dictionary dictionary;

	public void changeDictionaryByFactory(Language language) {
		if (language.equals(Language.SPANISH)) {
			this.dictionary = dictionaryFactory.createSpanishDictionary(); // 얘만 새 인스턴스 만들어줌
			return;
		}
		if (language.equals(Language.KOREAN)) {
			this.dictionary = dictionaryFactory.getKoreanDictionary(); // 얘는 싱글톤임
			return;
		}
		if (language.equals(Language.ENGLISH)) {
			this.dictionary = dictionaryFactory.getEnglishDictionary();
			return;
		}
		throw new IllegalArgumentException("지원하지 않는 언어입니다.");
	}

	public void hello() {
		if (dictionary == null) {
			throw new IllegalStateException("사전을 먼저 선택해주세요.");
		}
		dictionary.hello();
	}

	public void bye() {
		if (dictionary == null) {
			throw new IllegalStateException("사전을 먼저 선택해주세요.");
		}
		dictionary.bye();
	}
}
