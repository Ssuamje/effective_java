package my.effective.java.chapter2.item3;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

	@Test
	void 싱글톤_테스트() throws IOException, ClassNotFoundException {
		PublicSniper.INSTANCE.shoot(); // Public 필드 방식의 싱글턴 이용
		/*-----------------------------------------------------------------------------*/
		FactorySniper.callSangSu().shoot(); // 정적 팩터리 메서드를 이용
		FactorySniper.callSangSuInSpain().shoot(); // 정적 팩터리 메서드의 응용(다른 호출, 다른 싱글턴)
		/*-----------------------------------------------------------------------------*/
		Supplier<FactorySniper> sangSuSupplier = FactorySniper::callSangSu; // 공급자, 람다를 이용한 싱글턴
		sangSuSupplier.get().shoot(); // Supplier는 Lazy Evaluation을 한다고 한다. 나중에 더 찾아봐야할 것 같다.
		/*-----------------------------------------------------------------------------*/
		EnumSniper.INSTANCE.shoot(); // 열거 타입 방식의 싱글턴 이용
		/*-----------------------------------------------------------------------------*/
		SerializableSniper sniper = SerializableSniper.INSTANCE;

		// 직렬화
		String fileName = "singleton.obj";
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
		out.writeObject(sniper);
		out.close();

		// 역직렬화
		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
		SerializableSniper sniperAfterSerialDeserialization = (SerializableSniper) in.readObject();
		in.close();

		/* 기존의 싱글턴을 반환하는 private Object readResolve가 클래스 내에 선언되어있지 않으면 false, 선언되어 있으면 true */
		assertEquals(sniper, sniperAfterSerialDeserialization);
	}
}
