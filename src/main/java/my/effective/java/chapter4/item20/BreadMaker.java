package my.effective.java.chapter4.item20;

public abstract class BreadMaker {

	final void makeBread() {
		mixIngredients();
		ferment();
		bake();
		if (isTopped()) {
			topSomeIngredients();
		}
	}

	abstract void mixIngredients();

	abstract void ferment();

	abstract void bake();

	final void topSomeIngredients() {
		System.out.println("토핑 더 많이 얹기~");
	}

	boolean isTopped() {
		return false;
	}
}
