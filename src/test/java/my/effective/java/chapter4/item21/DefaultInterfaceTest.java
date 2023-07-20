package my.effective.java.chapter4.item21;

import org.junit.jupiter.api.Test;

public class DefaultInterfaceTest {

	@Test
	void 디폴트_메서드() {
		Walking straightWalking = new StraightWalking();
		straightWalking.walk();
		//중심 잡기!
		//앞을 보기!
		//앞으로 걷기!
		//중심 잡기!
		//앞으로 걷기!

		Walking palzaWalking = new PalzaWalking();
		palzaWalking.walk();
		//중심 잡기!
		//앞을 보기!
		//왼쪽으로 갔다가 ~
		//중심 잡기!
		//오른쪽으로 갔다가 ~
	}
}
