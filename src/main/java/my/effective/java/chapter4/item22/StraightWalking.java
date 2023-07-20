package my.effective.java.chapter4.item22;

public class StraightWalking implements Walking {
	@Override
	public void walk() {
		balance();
		lookAhead();
		moveForward();
		balance();
		moveForward();
	}

	private void moveForward() {
		System.out.println("앞으로 걷기!");
	}
}
