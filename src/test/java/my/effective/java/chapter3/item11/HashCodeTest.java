package my.effective.java.chapter3.item11;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HashCodeTest {
	@Test
	void HashCode_오버라이드() {
		/*-----------------------------------HashCode 재정의 X------------------------------------------*/
		Map<Contact, PhoneNumber> hashMap = new HashMap<>();
		hashMap.put(new Contact("홍길동", new PhoneNumber("010", "1234", "5678")), new PhoneNumber("010", "1234", "5678"));
		hashMap.put(new Contact("홍길동", new PhoneNumber("010", "1234", "5678")), new PhoneNumber("010", "1234", "5678"));
		assertNotEquals(1, hashMap.size()); //같은 엔트리임에도 불구하고 2개가 들어가는 이유는 hashCode를 오버라이드 하지 않았기 때문이다.
		/*-----------------------------------HashCode 재정의 O------------------------------------------*/
		Map<HashCodeContact, PhoneNumber> hashMap2 = new HashMap<>();
		hashMap2.put(new HashCodeContact("홍길동", new PhoneNumber("010", "1234", "5678")), new PhoneNumber("010", "1234", "5678"));
		hashMap2.put(new HashCodeContact("홍길동", new PhoneNumber("010", "1234", "5678")), new PhoneNumber("010", "1234", "5678"));
		assertEquals(1, hashMap2.size()); //hashCode를 오버라이드 하였기 때문에 같은 엔트리는 1개만 들어간다.
		//PhoneNumber 또한 HashCode가 Override 되어 있어야 한다.
	}
}
