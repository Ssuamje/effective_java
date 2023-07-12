package my.effective.java.chapter4.item18;

import org.junit.jupiter.api.Test;

public class CompositionTest {

	@Test
	void 캡슐화_테스트() {
		ParentCapsule parentCapsule = new ParentCapsule("티슈 세장씩 뽑아 씀", 3306, "몽키 D 루피");
		parentCapsule.introduce(); // 안녕하세요. 저는 몽키 D 루피입니다.

		ChildCapsule childCapsule = new ChildCapsule("코노에서 노래부르다가 이빨 깨졌던 일", 486, "부모님 속도 모르는 자식");
		childCapsule.introduce(); //안녕하세요. 저는 부모님 속도 모르는 자식인데요, 저가 부모님한테만 말하는 비밀은 코노에서 노래부르다가 이빨 깨졌던 일이구요, 저만 알고 있는 제 몸무게는 486입니다.
	}

	@Test
	void 컴포지션_테스트() {
		CarHasEngine car = new CarHasEngine(new EngineBelongsToCar());
		car.start(); // 부릉부릉 from Engine
	}
}
