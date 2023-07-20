package my.effective.java.chapter4.item20;

import org.junit.jupiter.api.Test;

public class InterfaceTest {

	@Test
	void 템플릿_메서드_패턴() {
		BaguetteMaker baguetteMaker = new BaguetteMaker();

		baguetteMaker.makeBread();
		//반죽 배합하기 ~
		//숙성하기~
		//오븐에 집어넣기~
		//토핑 더 많이 얹기~
	}

	@Test
	void 스켈레톤() {
		Washing myWashing = new WashingSkeleton() {
			@Override
			public void bodyWash() {
				System.out.println("몸을 씻기는 것도 꼼꼼하게~");
			}

			@Override
			public void hairDry() {
				System.out.println("머리도 대충 말리기~");
			}

			@Override
			public void faceWash() {
				System.out.println("얼굴은 무조건 미온수로 살살 씻기~");
			}
		};

		myWashing.doWashing();
		//양치 구석구석 꼼꼼하게 해버리기~
		//몸을 씻기는 것도 꼼꼼하게~
		//머리도 대충 말리기~
		//얼굴은 무조건 미온수로 살살 씻기~
	}


}
