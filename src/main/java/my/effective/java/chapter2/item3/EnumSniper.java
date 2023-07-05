package my.effective.java.chapter2.item3;

public enum EnumSniper {
	INSTANCE;

	private final String name = "정상수";

	void shoot() {
		System.out.println("ENUM: 탕~!");
	}
}
