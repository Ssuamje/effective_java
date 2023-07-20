package my.effective.java.chapter4.item20;

public class BaguetteMaker extends BreadMaker {

	@Override
	void mixIngredients() {
		System.out.println("반죽 배합하기 ~");
	}

	@Override
	void ferment() {
		System.out.println("숙성하기~");
	}

	@Override
	void bake() {
		System.out.println("오븐에 집어넣기~");
	}

	@Override
	boolean isTopped() {
		return true;
	}
}
