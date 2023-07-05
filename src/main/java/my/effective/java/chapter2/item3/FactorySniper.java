package my.effective.java.chapter2.item3;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FactorySniper {

	private static final FactorySniper INSTANCE = new FactorySniper("정상수", 33);
	private static final FactorySniper INSTANCE_IN_SPAIN = new FactorySniper("Fernando SangSu", 32);
	private final String name;
	private final Integer age;

	public static FactorySniper callSangSu() {
		return INSTANCE;
	}

	public static FactorySniper callSangSuInSpain() { // 호출별로 다른 인스턴스를 넘겨주는 방법
		return INSTANCE_IN_SPAIN;
	}

	public void shoot() {
		if (this.name.equals("정상수")) {
			System.out.println("FACTORY: 탕~!");
		} else {
			System.out.println("FACTORY: Señoritang~!");
		}
	}
}
