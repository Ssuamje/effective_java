package my.effective.java.chapter4.item22;

public class PalzaWalking implements Walking {
	@Override
	public void walk() {
		balance();
		lookAhead();
		moveLeft();
		balance();
		moveRight();
	}

	private void moveLeft() {
		System.out.println("왼쪽으로 갔다가 ~ ");
	}

	private void moveRight() {
		System.out.println("오른쪽으로 갔다가 ~ ");
	}
}
