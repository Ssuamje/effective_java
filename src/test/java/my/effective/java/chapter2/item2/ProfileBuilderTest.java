package my.effective.java.chapter2.item2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileBuilderTest {

	@Test
	void 빌더_테스트() {
		Profile profile = Profile.builder()
				.name("홍길동")
				.hobby("테니스")
				.age(30)
				.build();

		assertEquals("홍길동", profile.getName());
		assertEquals("테니스", profile.getHobby());
		assertEquals(30, profile.getAge());
		/*-------------------------------------------------------*/
		Profile profile2 = Profile.builder().name("금춘향").build();

		assertEquals("금춘향", profile2.getName());
		assertEquals(null, profile2.getHobby());
		assertEquals(0, profile2.getAge());
	}
}
