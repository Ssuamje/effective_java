package my.effective.java.chapter6.item36;

public class MyText {
	public static final int STYLE_BOLD = 1 << 0; // 1
	public static final int STYLE_ITALIC = 1 << 1; // 2
	public static final int STYLE_UNDERLINE = 1 << 2; // 4
	public static final int STYLE_STRIKETHROUGH = 1 << 3; // 8
	private int styles;

	// 스타일 적용
	public void applyStyle(int style) {
		styles |= style;
	}

	// 스타일 제거
	public void removeStyle(int style) {
		styles &= ~style;
	}
}
