package my.effective.java.chapter2.item5;

public class CreatableSpanishDictionary implements Dictionary {

	private static final String hello = "Hola";
	private static final String bye = "Adiós";
	private static final Language language = Language.SPANISH;

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
		return CreatableSpanishDictionary.language.equals(language);
	}
}
