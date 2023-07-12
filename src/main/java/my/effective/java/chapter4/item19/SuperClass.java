package my.effective.java.chapter4.item19;

import lombok.Getter;

@Getter
public class SuperClass {
	private final String name;

	public SuperClass(String name) {
		this.name = name;
		this.introduce();
	}

	public void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
}
