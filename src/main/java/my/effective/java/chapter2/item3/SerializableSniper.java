package my.effective.java.chapter2.item3;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SerializableSniper implements Serializable {

	public static final SerializableSniper INSTANCE = new SerializableSniper();

	public void shoot() {
		System.out.println("SERIALIZABLE: 탕~!");
	}

	private Object readResolve() { // 이 선언을 통해 역직렬화 시에도 싱글턴을 보장할 수 있다.
		return INSTANCE;
	}
}
