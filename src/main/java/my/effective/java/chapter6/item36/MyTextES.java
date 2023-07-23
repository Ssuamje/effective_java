package my.effective.java.chapter6.item36;

import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class MyTextES {
	private final Set<Style> styles; // 주입할 때 EnumSet으로 넣는 것이 좋을 듯

	public void applyStyles(Set<Style> styles) {
		this.styles.addAll(styles);
	}

	public void removeStyles(Set<Style> styles) {
		this.styles.removeAll(styles);
	}

	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
	}
}
