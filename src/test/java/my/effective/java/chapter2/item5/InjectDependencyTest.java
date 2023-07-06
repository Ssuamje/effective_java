package my.effective.java.chapter2.item5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InjectDependencyTest {

	@Test
	void 의존성_주입() {
		/*--------------------------------생성자 주입---------------------------------------------*/

		ConstructorBot constructorKoreanBot = new ConstructorBot(KoreanDictionary.getInstance());
		ConstructorBot constructorEnglishBot = new ConstructorBot(EnglishDictionary.getInstance());
		ConstructorBot constructorBotSpanishBot = new ConstructorBot(new CreatableSpanishDictionary());

		constructorKoreanBot.sayHello();
		constructorEnglishBot.sayHello();
		constructorBotSpanishBot.sayHello();

		/*--------------------------------정적 팩터리---------------------------------------------*/

		FactoryBot factoryKoreanBot = FactoryBot.of(Language.KOREAN);
		FactoryBot factoryEnglishBot = FactoryBot.of(Language.ENGLISH);
		FactoryBot factoryBotSpanishBot = FactoryBot.of(Language.SPANISH);

		factoryKoreanBot.sayHello();
		factoryEnglishBot.sayHello();
		factoryBotSpanishBot.sayHello();

		/*--------------------------------빌더 팩터리---------------------------------------------*/

		BuilderBot builderKoreanBot = BuilderBot.builder().dictionary(KoreanDictionary.getInstance()).build();
		BuilderBot builderEnglishBot = BuilderBot.builder().dictionary(EnglishDictionary.getInstance()).build();
		BuilderBot builderBotSpanishBot = BuilderBot.builder().dictionary(new CreatableSpanishDictionary()).build();

		builderKoreanBot.sayHello();
		builderEnglishBot.sayHello();
		builderBotSpanishBot.sayHello();

		/*--------------------------------팩터리 주입---------------------------------------------*/

		FactoryInjectedBot factoryInjectedBot = new FactoryInjectedBot(DictionaryFactory.getInstance());

		assertThrows(IllegalStateException.class, factoryInjectedBot::hello); // 사전을 선택하지 않았음

		factoryInjectedBot.changeDictionaryByFactory(Language.KOREAN);
		factoryInjectedBot.hello();
		factoryInjectedBot.changeDictionaryByFactory(Language.ENGLISH);
		factoryInjectedBot.hello();
		factoryInjectedBot.changeDictionaryByFactory(Language.SPANISH);
		factoryInjectedBot.hello();

		/*--------------------------------가변 static---------------------------------------------*/

		MutableBot mutableBot = MutableBot.getInstance();

		assertThrows(IllegalStateException.class, mutableBot::sayHello); // 사전을 선택하지 않았음

		MutableBot.changeDictionary(KoreanDictionary.getInstance());
		mutableBot.sayHello();
		MutableBot.changeDictionary(EnglishDictionary.getInstance());
		mutableBot.sayHello();
		MutableBot.changeDictionary(new CreatableSpanishDictionary());
		mutableBot.sayHello();
	}
}
