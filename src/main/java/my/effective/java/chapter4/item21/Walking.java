package my.effective.java.chapter4.item21;

public interface Walking {

	default void lookAhead() {
		System.out.println("앞을 보기!");
	}

	default void balance() {
		System.out.println("중심 잡기!");
	}

	void walk();
}
